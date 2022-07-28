# Ejemplos Android


1. [Picture in Picture](##Picture in Picture)


##Picture in Picture
PIP es un tipo especial de modo multiventana que se usa principalmente para actividades que deben estar activas en la pantalla pero que no deben ocupar todo el espacio de la pantalla, como ver videos, videollamadas, navegación, etc. Permite al usuario ver un video en un pequeña ventana anclada en una esquina de la pantalla (de forma predeterminada en la parte inferior derecha) mientras navega entre aplicaciones o explora contenido en la pantalla principal. Android 8.0 (API nivel 26) y superior permite que las actividades se inicien en modo PIP.
La ventana PIP aparece en la capa superior de la pantalla. Puede arrastrar la ventana PIP a otra ubicación usando algunos conmutadores especiales. Cuando toca la ventana, aparecen dos controles especiales:

- un interruptor de pantalla completa (en el centro de la ventana)
- un botón de cierre (una “X” en la esquina superior derecha)

Declar el soporte de pip: de forma predeterminada, ninguna actividad tiene habilitado el modo PIP. Esto debe hacerse a través del archivo Manifest:

`<activity android:name="VideoActivity"
    android:supportsPictureInPicture="true"
    android:configChanges=
        "screenSize|smallestScreenSize|screenLayout|orientation"
    ...
`

[Implementacion](https://github.com/RubenPardo/android_ejemplos/blob/master/app/src/main/java/com/example/rparcas/androidejmplos/PIPActivity.java)
