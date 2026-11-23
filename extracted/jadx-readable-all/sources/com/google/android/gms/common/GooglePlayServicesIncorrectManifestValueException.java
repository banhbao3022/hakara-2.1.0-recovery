package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import p007c.p190n.p194b.p266d.p298f.C2610f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = C2610f.f11567a;
        StringBuilder sb = new StringBuilder(320);
        sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb.append(i2);
        sb.append(" but found ");
        sb.append(i);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i, sb.toString());
    }
}
