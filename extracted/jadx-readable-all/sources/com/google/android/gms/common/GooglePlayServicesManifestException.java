package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    public GooglePlayServicesManifestException(int i, @RecentlyNonNull String str) {
        super(str);
    }
}
