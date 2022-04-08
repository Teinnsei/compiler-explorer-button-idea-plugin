package com.github.teinnsei.plugin.explorer
package client

import com.intellij.ide.BrowserUtil
import net.minidev.json.JSONValue

import java.util.Base64

trait BrowserCompilerExplorer extends CompilerExplorer {

  override final def openBrowser(source: String, lang: String): Unit = {
    val json =
      s"""{
         |  "sessions": [
         |    {
         |      "id": 1,
         |      "language": "$lang",
         |      "source": "${JSONValue.escape(source)}",
         |      "compilers": [
         |        {
         |          "id": "${compilers(lang).head.id}",
         |          "options": ""
         |        }
         |      ]
         |    }
         |  ]
         |}""".stripMargin

    val bytes = json.getBytes
    val base64 = Base64.getEncoder.encodeToString(bytes)

    BrowserUtil.browse(s"https://godbolt.org/clientstate/$base64")
  }
}
