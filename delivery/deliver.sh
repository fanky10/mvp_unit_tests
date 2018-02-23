RELEASE_NOTES=`cat release_notes.txt`
APP_VERSION_CODE=1
APP_VERSION_NAME=1.0.1


curl \
  -F "bundle_short_version=$APP_VERSION_NAME" \
  -F "bundle_version=$APP_VERSION_CODE" \
  -F "status=2" \
  -F "notify=1" \
  -F "notes_type=0" \
  -F "ipa=@generated.apk" \
  -F "notes=$RELEASE_NOTES" \
  -H "X-HockeyAppToken: 716cb520c75f468ba7daedaffabea1e0" \
  https://rink.hockeyapp.net/api/2/apps/44221341ec0e44cbb073db00c1e5e5b9/app_versions/new