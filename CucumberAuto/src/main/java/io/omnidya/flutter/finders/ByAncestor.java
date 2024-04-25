package io.omnidya.flutter.finders;

import io.omnidya.flutter.FlutterElement;


public interface ByAncestor {

    FlutterElement byAncestor(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);
}
