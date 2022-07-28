# Ejemplos Android


1. [Picture in Picture](#picture-in-picture)
2. [Modo nocturno](#modo-nocturno)
3. [Valorar App](#valorar-app)

## Picture in Picture
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

## Modo Nocturno
Tener dos archivos colors.xml para poder implementar el modo nocturno. Ademas guardar en shared preferences el modo en el que estas para tener constancia al abrir la app

[Implementación](https://github.com/RubenPardo/android_ejemplos/blob/master/app/src/main/java/com/example/rparcas/androidejmplos/ModoOscuro.java)

## Valorar App

Agregar la biblioteca de soporte en el archivo build.gradle y agregar la dependencia Android-Rate en la sección de dependencias. Esta biblioteca tiene una función que redirige al usuario a Google Play Store y le permite calificar la aplicación. Ayuda a obtener la retroalimentación.

`
    dependencies {
        implementation 'com.github.hotchemi:android-rate:1.0.1'
    }
` 

Las funciones predeterminadas como setInstallDays permiten que el cuadro de diálogo aparezca después de una cierta cantidad de días desde el día de la instalación de la aplicación, setLaunchTimes es la cantidad mínima de veces que el usuario debe iniciar la aplicación y setRemindInterval es la cantidad de días después en el que aparece el cuadro de diálogo después de que el usuario elige la opción neutral (Recordarme más tarde).

(Redirige al dominio de la aplicación de la play store)

[Implementación](https://github.com/RubenPardo/android_ejemplos/blob/master/app/src/main/java/com/example/rparcas/androidejmplos/ValorarAplicacionActivity.java)