package p636z0.p770y;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: renamed from: z0.y.f, reason: use source file name */
/* JADX INFO: compiled from: NavBackStackEntryState.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final UUID f39009f;

    /* JADX INFO: renamed from: g */
    public final int f39010g;

    /* JADX INFO: renamed from: h */
    public final Bundle f39011h;

    /* JADX INFO: renamed from: i */
    public final Bundle f39012i;

    /* JADX INFO: renamed from: z0.y.f$a */
    /* JADX INFO: compiled from: NavBackStackEntryState.java */
    public class a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        this.f39009f = navBackStackEntry.f39004k;
        this.f39010g = navBackStackEntry.f39000g.f39033h;
        this.f39011h = navBackStackEntry.f39001h;
        Bundle bundle = new Bundle();
        this.f39012i = bundle;
        navBackStackEntry.f39003j.m15022b(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39009f.toString());
        parcel.writeInt(this.f39010g);
        parcel.writeBundle(this.f39011h);
        parcel.writeBundle(this.f39012i);
    }

    public NavBackStackEntryState(Parcel parcel) {
        this.f39009f = UUID.fromString(parcel.readString());
        this.f39010g = parcel.readInt();
        this.f39011h = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.f39012i = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}
