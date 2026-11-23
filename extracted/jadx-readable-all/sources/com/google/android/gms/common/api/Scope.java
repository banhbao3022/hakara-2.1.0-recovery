package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2705o;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC2767a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C2705o();

    /* JADX INFO: renamed from: f */
    public final int f28646f;

    /* JADX INFO: renamed from: g */
    public final String f28647g;

    public Scope(@RecentlyNonNull String str) {
        C2622l.m5364f(str, "scopeUri must not be null or empty");
        this.f28646f = 1;
        this.f28647g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f28647g.equals(((Scope) obj).f28647g);
        }
        return false;
    }

    public int hashCode() {
        return this.f28647g.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f28647g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f28646f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f28647g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public Scope(int i, String str) {
        C2622l.m5364f(str, "scopeUri must not be null or empty");
        this.f28646f = i;
        this.f28647g = str;
    }
}
