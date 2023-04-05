package come.autoroute.helper.autoroutehelper.models

import com.jetbrains.lang.dart.psi.DartClassDefinition
import com.jetbrains.lang.dart.psi.DartMetadata

class RoutePageInfo(val classElement: DartClassDefinition, classOffset: Int, val annotation: DartMetadata?, val customName: String?)