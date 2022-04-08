package com.github.teinnsei.plugin.explorer

import client.CompilerExplorer
import icons.ExplorerIcons

import com.intellij.openapi.actionSystem._
import com.intellij.openapi.project.DumbAwareAction

class OpenCompilerExplorerAction
    extends DumbAwareAction(
      "Compiler Explorer",
      "",
      ExplorerIcons.Explorer
    ) {

  private val explorer = CompilerExplorer()

  private def languageId(e: AnActionEvent) =
    for {
      file     <- Option(e.getData(CommonDataKeys.VIRTUAL_FILE))
      ext      = file.getExtension
      language <- explorer.languageByExt(ext)
    } yield language.id

  override def actionPerformed(e: AnActionEvent): Unit = {
    val toShow =
      for {
        editor   <- Option(e.getData(CommonDataKeys.EDITOR))
        document = editor.getDocument
        source   = document.getText
        id       <- languageId(e)
      } yield (source, id)

    toShow.foreach((explorer.openBrowser _).tupled)
  }

  override def update(e: AnActionEvent): Unit = {
    val id        = languageId(e)
    val isEnabled = id.isDefined
    e.getPresentation.setEnabled(isEnabled)
  }
}
