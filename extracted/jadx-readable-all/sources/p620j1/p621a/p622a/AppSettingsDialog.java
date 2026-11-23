package p620j1.p621a.p622a;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: j1.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: AppSettingsDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f33098f;

    /* JADX INFO: renamed from: g */
    public final String f33099g;

    /* JADX INFO: renamed from: h */
    public final String f33100h;

    /* JADX INFO: renamed from: i */
    public final String f33101i;

    /* JADX INFO: renamed from: j */
    public final String f33102j;

    /* JADX INFO: renamed from: k */
    public final int f33103k;

    /* JADX INFO: renamed from: l */
    public final int f33104l;

    /* JADX INFO: renamed from: m */
    public Context f33105m;

    /* JADX INFO: renamed from: j1.a.a.a$a */
    /* JADX INFO: compiled from: AppSettingsDialog.java */
    public static class a implements Parcelable.Creator<AppSettingsDialog> {
        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog[] newArray(int i) {
            return new AppSettingsDialog[i];
        }
    }

    public AppSettingsDialog(Parcel parcel, a aVar) {
        this.f33098f = parcel.readInt();
        this.f33099g = parcel.readString();
        this.f33100h = parcel.readString();
        this.f33101i = parcel.readString();
        this.f33102j = parcel.readString();
        this.f33103k = parcel.readInt();
        this.f33104l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33098f);
        parcel.writeString(this.f33099g);
        parcel.writeString(this.f33100h);
        parcel.writeString(this.f33101i);
        parcel.writeString(this.f33102j);
        parcel.writeInt(this.f33103k);
        parcel.writeInt(this.f33104l);
    }
}
