package com.github.martinale14.stackedsnippetsintellij.implementations

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class FlutterContext protected constructor() :  TemplateContextType("DART_STATEMENT", "Flutter Stacked"){
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".dart")
    }
}