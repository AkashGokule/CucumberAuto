package io.omnidya.flutter.finders;

import io.omnidya.flutter.FlutterElement;

public interface ByValueKey {


    FlutterElement byValueKey(String key);

    FlutterElement byValueKey(int key);
}