package com.github.teinnsei.plugin.explorer
package client

trait CompilerExplorer {
  def languages: Seq[Language]
  def languageByExt(ext: String): Option[Language]
  def compilers: Seq[Compiler]
  def compilers(lang: String): Seq[Compiler]
  def openBrowser(source: String, lang: String): Unit
}

object CompilerExplorer {

  def apply(): CompilerExplorer =
    InMemoryCompilerExplorer
}
