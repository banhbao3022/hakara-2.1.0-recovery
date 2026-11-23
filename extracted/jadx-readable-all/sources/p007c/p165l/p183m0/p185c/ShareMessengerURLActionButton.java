package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.n, reason: use source file name */
/* JADX INFO: compiled from: ShareMessengerURLActionButton.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final Uri f5297g;

    /* JADX INFO: renamed from: h */
    public final Uri f5298h;

    /* JADX INFO: renamed from: i */
    public final boolean f5299i;

    /* JADX INFO: renamed from: j */
    public final boolean f5300j;

    /* JADX INFO: renamed from: k */
    public final b f5301k;

    /* JADX INFO: renamed from: c.l.m0.c.n$a */
    /* JADX INFO: compiled from: ShareMessengerURLActionButton.java */
    public static class a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        @Override // android.os.Parcelable.Creator
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.n$b */
    /* JADX INFO: compiled from: ShareMessengerURLActionButton.java */
    public enum b {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.f5297g = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5299i = parcel.readByte() != 0;
        this.f5298h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5301k = (b) parcel.readSerializable();
        this.f5300j = parcel.readByte() != 0;
    }
}
