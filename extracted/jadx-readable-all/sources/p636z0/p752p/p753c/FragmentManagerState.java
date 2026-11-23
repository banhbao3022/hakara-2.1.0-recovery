package p636z0.p752p.p753c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: z0.p.c.b0, reason: use source file name */
/* JADX INFO: compiled from: FragmentManagerState.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public ArrayList<FragmentState> f38278f;

    /* JADX INFO: renamed from: g */
    public ArrayList<String> f38279g;

    /* JADX INFO: renamed from: h */
    public BackStackState[] f38280h;

    /* JADX INFO: renamed from: i */
    public int f38281i;

    /* JADX INFO: renamed from: j */
    public String f38282j;

    /* JADX INFO: renamed from: k */
    public ArrayList<String> f38283k;

    /* JADX INFO: renamed from: l */
    public ArrayList<Bundle> f38284l;

    /* JADX INFO: renamed from: m */
    public ArrayList<FragmentManager.l> f38285m;

    /* JADX INFO: renamed from: z0.p.c.b0$a */
    /* JADX INFO: compiled from: FragmentManagerState.java */
    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f38282j = null;
        this.f38283k = new ArrayList<>();
        this.f38284l = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f38278f);
        parcel.writeStringList(this.f38279g);
        parcel.writeTypedArray(this.f38280h, i);
        parcel.writeInt(this.f38281i);
        parcel.writeString(this.f38282j);
        parcel.writeStringList(this.f38283k);
        parcel.writeTypedList(this.f38284l);
        parcel.writeTypedList(this.f38285m);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f38282j = null;
        this.f38283k = new ArrayList<>();
        this.f38284l = new ArrayList<>();
        this.f38278f = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f38279g = parcel.createStringArrayList();
        this.f38280h = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f38281i = parcel.readInt();
        this.f38282j = parcel.readString();
        this.f38283k = parcel.createStringArrayList();
        this.f38284l = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f38285m = parcel.createTypedArrayList(FragmentManager.l.CREATOR);
    }
}
