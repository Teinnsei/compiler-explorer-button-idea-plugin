package com.github.teinnsei.plugin.explorer
package client

final case class Compiler(
  id: String,
  name: String,
  lang: String,
  compilerType: String,
  semver: String,
  instructionSet: String
)
