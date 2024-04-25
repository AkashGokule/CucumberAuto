package io.omnidya.flutter.finders;
import io.omnidya.flutter.FlutterElement;

import java.util.regex.Pattern;


public interface BySemanticsLabel {

    FlutterElement bySemanticsLabel(String label);

    FlutterElement bySemanticsLabel(Pattern label);
}
