package io.omnidya.flutter.finders;

import io.omnidya.flutter.FlutterElement;


public interface ByDescendant {

    FlutterElement byDescendant(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);

}