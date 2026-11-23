package p636z0.p637a.p639e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.a.e.a, reason: use source file name */
/* JADX INFO: compiled from: ActivityResult.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f34171f;

    /* JADX INFO: renamed from: g */
    public final Intent f34172g;

    /* JADX INFO: renamed from: z0.a.e.a$a */
    /* JADX INFO: compiled from: ActivityResult.java */
    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f34171f = i;
        this.f34172g = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String strValueOf;
        StringBuilder sbM1556G = outline.m1556G("ActivityResult{resultCode=");
        int i = this.f34171f;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sbM1556G.append(strValueOf);
        sbM1556G.append(", data=");
        sbM1556G.append(this.f34172g);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34171f);
        parcel.writeInt(this.f34172g == null ? 0 : 1);
        Intent intent = this.f34172g;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f34171f = parcel.readInt();
        this.f34172g = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
