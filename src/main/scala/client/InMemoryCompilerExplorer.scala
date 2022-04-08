package com.github.teinnsei.plugin.explorer
package client

object InMemoryCompilerExplorer extends CompilerExplorer with BrowserCompilerExplorer {

  override def languages: Seq[Language] =
    Languages.languages

  override def languageByExt(ext: String): Option[Language] =
    Languages.ext2language.get(ext)

  override def compilers: Seq[Compiler] =
    Compilers.compilers

  override def compilers(lang: String): Seq[Compiler] =
    Compilers.lang2compilers(lang)
}
