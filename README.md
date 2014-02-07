#CrashOnEnum

Sample for robolectric bug.

Robolectric does not handle applying an integer value to an enum attribute
using a theme.

Android does support this pattern.

I can not find any examples of this pattern in the framework themes.

The workaround is to apply the value through a style, similar to how
TextView/textAppearance works.

#Usage
 1. $ gradle installDebug, launch CrashOnEmum
 1. Notice the value '2' is displayed. This value is defined by an interger that is referenced by a theme.
 1. $ gradle check
 1. Notice the test failed
```
Caused by: java.lang.RuntimeException: no value found for 2
	at org.robolectric.shadows.Converter$EnumOrFlagConverter.findValueFor(Converter.java:375)
	at org.robolectric.shadows.Converter$EnumConverter.fillTypedValue(Converter.java:343)
```


