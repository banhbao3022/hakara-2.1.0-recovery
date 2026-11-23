package p629y0.p630a.p632b.p633a.p634a;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: y0.a.b.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: IMediaSession.java */
/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    /* JADX INFO: renamed from: y0.a.b.a.a.b$a */
    /* JADX INFO: compiled from: IMediaSession.java */
    public static abstract class a extends Binder implements IMediaSession {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f34154f = 0;

        /* JADX INFO: renamed from: y0.a.b.a.a.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMediaSession.java */
        public static class C8557a implements IMediaSession {

            /* JADX INFO: renamed from: f */
            public IBinder f34155f;

            public C8557a(IBinder iBinder) {
                this.f34155f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34155f;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: b1 */
            public void mo99b1(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder((IMediaControllerCallback.a) iMediaControllerCallback);
                    if (!this.f34155f.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f34154f;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: r2 */
            public MediaMetadataCompat mo109r2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f34155f.transact(27, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f34154f;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaSession
            /* JADX INFO: renamed from: t3 */
            public boolean mo111t3(KeyEvent keyEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(1);
                    keyEvent.writeToParcel(parcelObtain, 0);
                    if (!this.f34155f.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f34154f;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* JADX INFO: renamed from: E0 */
        public static IMediaSession m14489E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) ? new C8557a(iBinder) : (IMediaSession) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo97Y4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zMo111t3 = mo111t3(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo111t3 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo99b1(IMediaControllerCallback.a.m14488E0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo116y2(IMediaControllerCallback.a.m14488E0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zMo75B1 = mo75B1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo75B1 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strMo104m6 = mo104m6();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo104m6);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strMo112w0 = mo112w0();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo112w0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentMo80F1 = mo80F1();
                    parcel2.writeNoException();
                    if (pendingIntentMo80F1 != null) {
                        parcel2.writeInt(1);
                        pendingIntentMo80F1.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long jMo113w5 = mo113w5();
                    parcel2.writeNoException();
                    parcel2.writeLong(jMo113w5);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo parcelableVolumeInfoMo85J5 = mo85J5();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoMo85J5 != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoMo85J5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo79E3(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo107q1(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo95U();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo78E2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo84J2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo91O2(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo81F5(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo87L2();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo100h5();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo114x(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo103m1(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo94T0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat mediaMetadataCompatMo109r2 = mo109r2();
                    parcel2.writeNoException();
                    if (mediaMetadataCompatMo109r2 != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(mediaMetadataCompatMo109r2.f58g);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackStateCompatMo92P = mo92P();
                    parcel2.writeNoException();
                    if (playbackStateCompatMo92P != null) {
                        parcel2.writeInt(1);
                        playbackStateCompatMo92P.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> listMo98a5 = mo98a5();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listMo98a5);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceMo101k2 = mo101k2();
                    parcel2.writeNoException();
                    if (charSequenceMo101k2 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceMo101k2, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleMo90N5 = mo90N5();
                    parcel2.writeNoException();
                    if (bundleMo90N5 != null) {
                        parcel2.writeInt(1);
                        bundleMo90N5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iMo86K1 = mo86K1();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo86K1);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo110s2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo89M1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo108r1(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iMo74A5 = mo74A5();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo74A5);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zMo102l1 = mo102l1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo102l1 ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo82G5(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo77D1(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo88L3(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo73A1(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo117z4(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zMo76C4 = mo76C4();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo76C4 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo93R3(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iMo106p4 = mo106p4();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo106p4);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo96V5(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo105o3(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleMo115x2 = mo115x2();
                    parcel2.writeNoException();
                    if (bundleMo115x2 != null) {
                        parcel2.writeInt(1);
                        bundleMo115x2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo83H3(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    void mo73A1(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: A5 */
    int mo74A5() throws RemoteException;

    /* JADX INFO: renamed from: B1 */
    boolean mo75B1() throws RemoteException;

    /* JADX INFO: renamed from: C4 */
    boolean mo76C4() throws RemoteException;

    /* JADX INFO: renamed from: D1 */
    void mo77D1(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: E2 */
    void mo78E2(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: E3 */
    void mo79E3(int i, int i2, String str) throws RemoteException;

    /* JADX INFO: renamed from: F1 */
    PendingIntent mo80F1() throws RemoteException;

    /* JADX INFO: renamed from: F5 */
    void mo81F5(long j2) throws RemoteException;

    /* JADX INFO: renamed from: G5 */
    void mo82G5(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: H3 */
    void mo83H3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: J2 */
    void mo84J2(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: J5 */
    ParcelableVolumeInfo mo85J5() throws RemoteException;

    /* JADX INFO: renamed from: K1 */
    int mo86K1() throws RemoteException;

    /* JADX INFO: renamed from: L2 */
    void mo87L2() throws RemoteException;

    /* JADX INFO: renamed from: L3 */
    void mo88L3(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* JADX INFO: renamed from: M1 */
    void mo89M1(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: N5 */
    Bundle mo90N5() throws RemoteException;

    /* JADX INFO: renamed from: O2 */
    void mo91O2(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: P */
    PlaybackStateCompat mo92P() throws RemoteException;

    /* JADX INFO: renamed from: R3 */
    void mo93R3(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: T0 */
    void mo94T0(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: U */
    void mo95U() throws RemoteException;

    /* JADX INFO: renamed from: V5 */
    void mo96V5(int i) throws RemoteException;

    /* JADX INFO: renamed from: Y4 */
    void mo97Y4(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* JADX INFO: renamed from: a5 */
    List<MediaSessionCompat.QueueItem> mo98a5() throws RemoteException;

    /* JADX INFO: renamed from: b1 */
    void mo99b1(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

    /* JADX INFO: renamed from: h5 */
    void mo100h5() throws RemoteException;

    /* JADX INFO: renamed from: k2 */
    CharSequence mo101k2() throws RemoteException;

    /* JADX INFO: renamed from: l1 */
    boolean mo102l1() throws RemoteException;

    /* JADX INFO: renamed from: m1 */
    void mo103m1(RatingCompat ratingCompat) throws RemoteException;

    /* JADX INFO: renamed from: m6 */
    String mo104m6() throws RemoteException;

    void next() throws RemoteException;

    /* JADX INFO: renamed from: o3 */
    void mo105o3(float f) throws RemoteException;

    /* JADX INFO: renamed from: p4 */
    int mo106p4() throws RemoteException;

    void pause() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    /* JADX INFO: renamed from: q1 */
    void mo107q1(int i, int i2, String str) throws RemoteException;

    /* JADX INFO: renamed from: r1 */
    void mo108r1(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: r2 */
    MediaMetadataCompat mo109r2() throws RemoteException;

    /* JADX INFO: renamed from: s2 */
    void mo110s2(String str, Bundle bundle) throws RemoteException;

    void setRepeatMode(int i) throws RemoteException;

    void stop() throws RemoteException;

    /* JADX INFO: renamed from: t3 */
    boolean mo111t3(KeyEvent keyEvent) throws RemoteException;

    /* JADX INFO: renamed from: w0 */
    String mo112w0() throws RemoteException;

    /* JADX INFO: renamed from: w5 */
    long mo113w5() throws RemoteException;

    /* JADX INFO: renamed from: x */
    void mo114x(long j2) throws RemoteException;

    /* JADX INFO: renamed from: x2 */
    Bundle mo115x2() throws RemoteException;

    /* JADX INFO: renamed from: y2 */
    void mo116y2(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

    /* JADX INFO: renamed from: z4 */
    void mo117z4(int i) throws RemoteException;
}
