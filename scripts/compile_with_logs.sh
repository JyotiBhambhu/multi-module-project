#!/usr/bin/env bash
set -xeuo pipefail

./gradlew clean
./gradlew app:assembleDebug | tee out.log