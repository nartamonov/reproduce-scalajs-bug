import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

name                     := "root-module"

ThisBuild / scalaVersion := "2.13.14"

Test / fork := false

scalaJSUseMainModuleInitializer := true

// Emit modules in the most Parcel-friendly way
scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("company.root_module")))
}
