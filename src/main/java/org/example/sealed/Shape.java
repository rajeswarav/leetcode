package org.example.sealed;

public sealed interface  Shape permits Square, Rectangle {
    double area();
}
