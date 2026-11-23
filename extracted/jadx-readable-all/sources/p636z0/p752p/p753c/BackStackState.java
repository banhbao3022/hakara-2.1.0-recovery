package p636z0.p752p.p753c;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: z0.p.c.b, reason: use source file name */
/* JADX INFO: compiled from: BackStackState.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int[] f38264f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> f38265g;

    /* JADX INFO: renamed from: h */
    public final int[] f38266h;

    /* JADX INFO: renamed from: i */
    public final int[] f38267i;

    /* JADX INFO: renamed from: j */
    public final int f38268j;

    /* JADX INFO: renamed from: k */
    public final String f38269k;

    /* JADX INFO: renamed from: l */
    public final int f38270l;

    /* JADX INFO: renamed from: m */
    public final int f38271m;

    /* JADX INFO: renamed from: n */
    public final CharSequence f38272n;

    /* JADX INFO: renamed from: o */
    public final int f38273o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f38274p;

    /* JADX INFO: renamed from: q */
    public final ArrayList<String> f38275q;

    /* JADX INFO: renamed from: r */
    public final ArrayList<String> f38276r;

    /* JADX INFO: renamed from: s */
    public final boolean f38277s;

    /* JADX INFO: renamed from: z0.p.c.b$a */
    /* JADX INFO: compiled from: BackStackState.java */
    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f38352a.size();
        this.f38264f = new int[size * 5];
        if (!backStackRecord.f38358g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f38265g = new ArrayList<>(size);
        this.f38266h = new int[size];
        this.f38267i = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            FragmentTransaction.a aVar = backStackRecord.f38352a.get(i);
            int i3 = i2 + 1;
            this.f38264f[i2] = aVar.f38368a;
            ArrayList<String> arrayList = this.f38265g;
            Fragment fragment = aVar.f38369b;
            arrayList.add(fragment != null ? fragment.f38437l : null);
            int[] iArr = this.f38264f;
            int i4 = i3 + 1;
            iArr[i3] = aVar.f38370c;
            int i5 = i4 + 1;
            iArr[i4] = aVar.f38371d;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f38372e;
            iArr[i6] = aVar.f38373f;
            this.f38266h[i] = aVar.f38374g.ordinal();
            this.f38267i[i] = aVar.f38375h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f38268j = backStackRecord.f38357f;
        this.f38269k = backStackRecord.f38360i;
        this.f38270l = backStackRecord.f38263s;
        this.f38271m = backStackRecord.f38361j;
        this.f38272n = backStackRecord.f38362k;
        this.f38273o = backStackRecord.f38363l;
        this.f38274p = backStackRecord.f38364m;
        this.f38275q = backStackRecord.f38365n;
        this.f38276r = backStackRecord.f38366o;
        this.f38277s = backStackRecord.f38367p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f38264f);
        parcel.writeStringList(this.f38265g);
        parcel.writeIntArray(this.f38266h);
        parcel.writeIntArray(this.f38267i);
        parcel.writeInt(this.f38268j);
        parcel.writeString(this.f38269k);
        parcel.writeInt(this.f38270l);
        parcel.writeInt(this.f38271m);
        TextUtils.writeToParcel(this.f38272n, parcel, 0);
        parcel.writeInt(this.f38273o);
        TextUtils.writeToParcel(this.f38274p, parcel, 0);
        parcel.writeStringList(this.f38275q);
        parcel.writeStringList(this.f38276r);
        parcel.writeInt(this.f38277s ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f38264f = parcel.createIntArray();
        this.f38265g = parcel.createStringArrayList();
        this.f38266h = parcel.createIntArray();
        this.f38267i = parcel.createIntArray();
        this.f38268j = parcel.readInt();
        this.f38269k = parcel.readString();
        this.f38270l = parcel.readInt();
        this.f38271m = parcel.readInt();
        this.f38272n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f38273o = parcel.readInt();
        this.f38274p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f38275q = parcel.createStringArrayList();
        this.f38276r = parcel.createStringArrayList();
        this.f38277s = parcel.readInt() != 0;
    }
}
