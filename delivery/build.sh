APK_PATH=app/build/outputs/apk/debug/app-debug.apk

cd /project
rm -r local.properties
./gradlew assembleDebug
mv $APK_PATH delivery/generated.apk
cd /project/delivery
