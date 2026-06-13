name: Build and Release Mod

on:
  push:
    branches: [ main ]
  workflow_dispatch:

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v3
    
    - name: Set up JDK 21
      uses: actions/setup-java@v3
      with:
        java-version: '21'
        distribution: 'temurin'
    
    - name: Make gradlew executable
      run: chmod +x gradlew
    
    - name: Build with Gradle
      run: ./gradlew clean build
    
    - name: Upload JAR as artifact
      uses: actions/upload-artifact@v3
      with:
        name: lagmod-build
        path: build/libs/lagmod-1.0.0.jar
