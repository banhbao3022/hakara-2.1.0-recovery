package p636z0.p637a.p639e;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: z0.a.e.f, reason: use source file name */
/* JADX INFO: compiled from: IntentSenderRequest.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final IntentSender f34187f;

    /* JADX INFO: renamed from: g */
    public final Intent f34188g;

    /* JADX INFO: renamed from: h */
    public final int f34189h;

    /* JADX INFO: renamed from: i */
    public final int f34190i;

    /* JADX INFO: renamed from: z0.a.e.f$a */
    /* JADX INFO: compiled from: IntentSenderRequest.java */
    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f34187f = intentSender;
        this.f34188g = intent;
        this.f34189h = i;
        this.f34190i = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f34187f, i);
        parcel.writeParcelable(this.f34188g, i);
        parcel.writeInt(this.f34189h);
        parcel.writeInt(this.f34190i);
    }

    /* JADX INFO: renamed from: z0.a.e.f$b */
    /* JADX INFO: compiled from: IntentSenderRequest.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public IntentSender f34191a;

        /* JADX INFO: renamed from: b */
        public Intent f34192b;

        /* JADX INFO: renamed from: c */
        public int f34193c;

        /* JADX INFO: renamed from: d */
        public int f34194d;

        public b(IntentSender intentSender) {
            this.f34191a = intentSender;
        }

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f34187f = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f34188g = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f34189h = parcel.readInt();
        this.f34190i = parcel.readInt();
    }
}
