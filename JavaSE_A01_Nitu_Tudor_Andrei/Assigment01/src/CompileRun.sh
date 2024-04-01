#!/bin/bash


find_project_directory() {
    local dir="$1"
    local target_dir="Assignment01"

    found_dir=$(find "$dir" -type d -name "$target_dir" -print -quit)

    if [ -n "$found_dir" ]; then
        echo "$found_dir"
    else
        echo "Error: $target_dir directory not found"
        exit 1
    fi
}

project_dir=$(find_project_directory "$(pwd)")



sudo javac Main.java

if [ $? -eq 0 ]; then
    echo "Compilation successful"

    java Main.java

else
    echo "Compilation failed"
fi