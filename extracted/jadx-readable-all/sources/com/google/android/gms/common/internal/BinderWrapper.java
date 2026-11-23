package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import p007c.p190n.p194b.p266d.p298f.p302q.C2764v0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class BinderWrapper implements Parcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C2764v0();

    /* JADX INFO: renamed from: f */
    public IBinder f28673f;

    public BinderWrapper(@RecentlyNonNull IBinder iBinder) {
        this.f28673f = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f28673f);
    }
}
