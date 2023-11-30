package com.example.netbooks;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class TodoItem {
        public final String name;

        public TodoItem(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
}
