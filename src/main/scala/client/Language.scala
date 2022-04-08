package com.github.teinnsei.plugin.explorer

package client

final case class Language(
  id: String,
  name: String,
  extensions: List[String],
  monaco: String
)
