docker -v
docker run --rm -v `pwd`:/project mingc/android-build-box bash -c 'cd /project/delivery; ./build.sh; ./deliver.sh'