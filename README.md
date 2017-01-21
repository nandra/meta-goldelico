# meta-goldelico
Yocto layer for building images for goldelico devices

To build image for letux-cortex-a8 machine use, include meta-goldelico layer
to poky and run:

```
MACHINE=letux-cortex-a8 nice bitbake core-image-minimal
```

which will build minimal image.
