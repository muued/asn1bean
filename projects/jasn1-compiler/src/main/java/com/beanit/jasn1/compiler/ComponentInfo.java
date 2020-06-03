package com.beanit.jasn1.compiler;

import com.beanit.jasn1.compiler.BerClassWriter.Tag;

class ComponentInfo {

  final String variableName;
  final String className;
  final Tag tag;
  final boolean mayBeLast;
  final boolean isOptionalOrDefault;
  final boolean isUntaggedChoiceOrAny;

  public ComponentInfo(
      String variableName,
      String className,
      Tag tag,
      boolean mayBeLast,
      boolean isOptionalOrDefault,
      boolean isUntaggedChoiceOrAny) {
    this.variableName = variableName;
    this.className = className;
    this.tag = tag;
    this.mayBeLast = mayBeLast;
    this.isOptionalOrDefault = isOptionalOrDefault;
    this.isUntaggedChoiceOrAny = isUntaggedChoiceOrAny;
  }
}