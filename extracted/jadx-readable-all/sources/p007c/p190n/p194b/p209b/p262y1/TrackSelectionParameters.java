package p007c.p190n.p194b.p209b.p262y1;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Locale;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.y1.m, reason: use source file name */
/* JADX INFO: compiled from: TrackSelectionParameters.java */
/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    /* JADX INFO: renamed from: f */
    public static final TrackSelectionParameters f10350f;

    /* JADX INFO: renamed from: g */
    public final ImmutableList2<String> f10351g;

    /* JADX INFO: renamed from: h */
    public final int f10352h;

    /* JADX INFO: renamed from: i */
    public final ImmutableList2<String> f10353i;

    /* JADX INFO: renamed from: j */
    public final int f10354j;

    /* JADX INFO: renamed from: k */
    public final boolean f10355k;

    /* JADX INFO: renamed from: l */
    public final int f10356l;

    /* JADX INFO: renamed from: c.n.b.b.y1.m$a */
    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public class a implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrackSelectionParameters[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    static {
        b bVar = new b();
        f10350f = new TrackSelectionParameters(bVar.f10357a, bVar.f10358b, bVar.f10359c, bVar.f10360d, bVar.f10361e, bVar.f10362f);
        CREATOR = new a();
    }

    public TrackSelectionParameters(ImmutableList2<String> immutableList2, int i, ImmutableList2<String> immutableList3, int i2, boolean z, int i3) {
        this.f10351g = immutableList2;
        this.f10352h = i;
        this.f10353i = immutableList3;
        this.f10354j = i2;
        this.f10355k = z;
        this.f10356l = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.f10351g.equals(trackSelectionParameters.f10351g) && this.f10352h == trackSelectionParameters.f10352h && this.f10353i.equals(trackSelectionParameters.f10353i) && this.f10354j == trackSelectionParameters.f10354j && this.f10355k == trackSelectionParameters.f10355k && this.f10356l == trackSelectionParameters.f10356l;
    }

    public int hashCode() {
        return ((((((this.f10353i.hashCode() + ((((this.f10351g.hashCode() + 31) * 31) + this.f10352h) * 31)) * 31) + this.f10354j) * 31) + (this.f10355k ? 1 : 0)) * 31) + this.f10356l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f10351g);
        parcel.writeInt(this.f10352h);
        parcel.writeList(this.f10353i);
        parcel.writeInt(this.f10354j);
        boolean z = this.f10355k;
        int i2 = Util6.f6307a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f10356l);
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.m$b */
    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public ImmutableList2<String> f10357a;

        /* JADX INFO: renamed from: b */
        public int f10358b;

        /* JADX INFO: renamed from: c */
        public ImmutableList2<String> f10359c;

        /* JADX INFO: renamed from: d */
        public int f10360d;

        /* JADX INFO: renamed from: e */
        public boolean f10361e;

        /* JADX INFO: renamed from: f */
        public int f10362f;

        public b(Context context) {
            this();
            mo4534a(context);
        }

        /* JADX INFO: renamed from: a */
        public b mo4534a(Context context) {
            CaptioningManager captioningManager;
            int i = Util6.f6307a;
            if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.f10360d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f10359c = ImmutableList2.m11637B(i >= 21 ? locale.toLanguageTag() : locale.toString());
                }
            }
            return this;
        }

        @Deprecated
        public b() {
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            ImmutableList2 immutableList2 = RegularImmutableList.f26218h;
            this.f10357a = immutableList2;
            this.f10358b = 0;
            this.f10359c = immutableList2;
            this.f10360d = 0;
            this.f10361e = false;
            this.f10362f = 0;
        }
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f10351g = ImmutableList2.m11642x(arrayList);
        this.f10352h = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f10353i = ImmutableList2.m11642x(arrayList2);
        this.f10354j = parcel.readInt();
        int i = Util6.f6307a;
        this.f10355k = parcel.readInt() != 0;
        this.f10356l = parcel.readInt();
    }
}
