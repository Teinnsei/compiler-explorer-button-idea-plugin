package com.github.teinnsei.plugin.explorer

package client

object Languages {

  val languages: Vector[Language] =
    Vector(
      Language("csharp", "C#", List("cs"), "csharp"),
      Language("fsharp", "F#", List("fs"), "fsharp"),
      Language("vb", "Visual Basic", List("vb"), "vb"),
      Language("go", "Go", List("go"), "go"),
      Language("c", "C", List("c", "h"), "nc"),
      Language("fortran", "Fortran", List("f90", "F90", "f95", "F95", "f"), "fortran"),
      Language("assembly", "Assembly", List("asm"), "asm"),
      Language("c++", "C++", List("cpp", "cxx", "hpp", "hxx", "cc", "ixx"), "cppp"),
      Language("crystal", "Crystal", List("cr"), "crystal"),
      Language("dart", "Dart", List("dart"), "dart"),
      Language("erlang", "Erlang", List("erl", "hrl"), "erlang"),
      Language("cuda", "CUDA C++", List("cu"), "cuda"),
      Language("python", "Python", List("py"), "python"),
      Language("ruby", "Ruby", List("rb"), "ruby"),
      Language("typescript", "TypeScript", List("ts", "d.ts"), "typescript"),
      Language("ada", "Ada", List("adb", "ads"), "ada"),
      Language("cpp_for_opencl", "C++ for OpenCL", List("clcpp", "cl", "ocl"), "cpp-for-opencl"),
      Language("llvm", "LLVM IR", List("ll"), "llvm-ir"),
      Language("d", "D", List("d"), "d"),
      Language("rust", "Rust", List("rs"), "rust"),
      Language("ispc", "ispc", List("ispc"), "ispc"),
      Language("java", "Java", List("java"), "java"),
      Language("kotlin", "Kotlin", List("kt"), "kotlin"),
      Language("nim", "Nim", List("nim"), "nim"),
      Language("scala", "Scala", List("scala"), "scala"),
      Language("clean", "Clean", List("icl"), "clean"),
      Language("pascal", "Pascal", List("pas", "dpr"), "pascal"),
      Language("haskell", "Haskell", List("hs", "haskell"), "haskell"),
      Language("ocaml", "OCaml", List("ml", "mli"), "ocaml"),
      Language("swift", "Swift", List("swift"), "swift"),
      Language("zig", "Zig", List("zig"), "zig")
    )

  val ext2language: Map[String, Language] =
    languages.flatMap(l => l.extensions.map(ext => (ext, l))).toMap
}
