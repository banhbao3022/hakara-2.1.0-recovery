package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0040a();

    /* JADX INFO: renamed from: f */
    public final int f110f;

    /* JADX INFO: renamed from: g */
    public final long f111g;

    /* JADX INFO: renamed from: h */
    public final long f112h;

    /* JADX INFO: renamed from: i */
    public final float f113i;

    /* JADX INFO: renamed from: j */
    public final long f114j;

    /* JADX INFO: renamed from: k */
    public final int f115k;

    /* JADX INFO: renamed from: l */
    public final CharSequence f116l;

    /* JADX INFO: renamed from: m */
    public final long f117m;

    /* JADX INFO: renamed from: n */
    public List<CustomAction> f118n;

    /* JADX INFO: renamed from: o */
    public final long f119o;

    /* JADX INFO: renamed from: p */
    public final Bundle f120p;

    /* JADX INFO: renamed from: q */
    public PlaybackState f121q;

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C0040a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j2, long j3, float f, long j4, int i2, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f110f = i;
        this.f111g = j2;
        this.f112h = j3;
        this.f113i = f;
        this.f114j = j4;
        this.f115k = i2;
        this.f116l = charSequence;
        this.f117m = j5;
        this.f118n = new ArrayList(list);
        this.f119o = j6;
        this.f120p = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f110f + ", position=" + this.f111g + ", buffered position=" + this.f112h + ", speed=" + this.f113i + ", updated=" + this.f117m + ", actions=" + this.f114j + ", error code=" + this.f115k + ", error message=" + this.f116l + ", custom actions=" + this.f118n + ", active item id=" + this.f119o + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110f);
        parcel.writeLong(this.f111g);
        parcel.writeFloat(this.f113i);
        parcel.writeLong(this.f117m);
        parcel.writeLong(this.f112h);
        parcel.writeLong(this.f114j);
        TextUtils.writeToParcel(this.f116l, parcel, i);
        parcel.writeTypedList(this.f118n);
        parcel.writeLong(this.f119o);
        parcel.writeBundle(this.f120p);
        parcel.writeInt(this.f115k);
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static final class C0041b {

        /* JADX INFO: renamed from: a */
        public final List<CustomAction> f127a;

        /* JADX INFO: renamed from: b */
        public int f128b;

        /* JADX INFO: renamed from: c */
        public long f129c;

        /* JADX INFO: renamed from: d */
        public long f130d;

        /* JADX INFO: renamed from: e */
        public float f131e;

        /* JADX INFO: renamed from: f */
        public long f132f;

        /* JADX INFO: renamed from: g */
        public int f133g;

        /* JADX INFO: renamed from: h */
        public CharSequence f134h;

        /* JADX INFO: renamed from: i */
        public long f135i;

        /* JADX INFO: renamed from: j */
        public long f136j;

        /* JADX INFO: renamed from: k */
        public Bundle f137k;

        public C0041b() {
            this.f127a = new ArrayList();
            this.f136j = -1L;
        }

        /* JADX INFO: renamed from: a */
        public PlaybackStateCompat m119a() {
            return new PlaybackStateCompat(this.f128b, this.f129c, this.f130d, this.f131e, this.f132f, this.f133g, this.f134h, this.f135i, this.f127a, this.f136j, this.f137k);
        }

        /* JADX INFO: renamed from: b */
        public C0041b m120b(int i, long j2, float f) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f128b = i;
            this.f129c = j2;
            this.f135i = jElapsedRealtime;
            this.f131e = f;
            return this;
        }

        public C0041b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f127a = arrayList;
            this.f136j = -1L;
            this.f128b = playbackStateCompat.f110f;
            this.f129c = playbackStateCompat.f111g;
            this.f131e = playbackStateCompat.f113i;
            this.f135i = playbackStateCompat.f117m;
            this.f130d = playbackStateCompat.f112h;
            this.f132f = playbackStateCompat.f114j;
            this.f133g = playbackStateCompat.f115k;
            this.f134h = playbackStateCompat.f116l;
            List<CustomAction> list = playbackStateCompat.f118n;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f136j = playbackStateCompat.f119o;
            this.f137k = playbackStateCompat.f120p;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0039a();

        /* JADX INFO: renamed from: f */
        public final String f122f;

        /* JADX INFO: renamed from: g */
        public final CharSequence f123g;

        /* JADX INFO: renamed from: h */
        public final int f124h;

        /* JADX INFO: renamed from: i */
        public final Bundle f125i;

        /* JADX INFO: renamed from: j */
        public PlaybackState.CustomAction f126j;

        /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C0039a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f122f = str;
            this.f123g = charSequence;
            this.f124h = i;
            this.f125i = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Action:mName='");
            sbM1556G.append((Object) this.f123g);
            sbM1556G.append(", mIcon=");
            sbM1556G.append(this.f124h);
            sbM1556G.append(", mExtras=");
            sbM1556G.append(this.f125i);
            return sbM1556G.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f122f);
            TextUtils.writeToParcel(this.f123g, parcel, i);
            parcel.writeInt(this.f124h);
            parcel.writeBundle(this.f125i);
        }

        public CustomAction(Parcel parcel) {
            this.f122f = parcel.readString();
            this.f123g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f124h = parcel.readInt();
            this.f125i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f110f = parcel.readInt();
        this.f111g = parcel.readLong();
        this.f113i = parcel.readFloat();
        this.f117m = parcel.readLong();
        this.f112h = parcel.readLong();
        this.f114j = parcel.readLong();
        this.f116l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f118n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f119o = parcel.readLong();
        this.f120p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f115k = parcel.readInt();
    }
}
