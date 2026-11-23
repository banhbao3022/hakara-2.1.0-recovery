package p629y0.p630a.p632b.p633a.p634a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: y0.a.b.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: IMediaControllerCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface IMediaControllerCallback extends IInterface {

    /* JADX INFO: renamed from: y0.a.b.a.a.a$a */
    /* JADX INFO: compiled from: IMediaControllerCallback.java */
    public static abstract class a extends Binder implements IMediaControllerCallback {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f34152f = 0;

        /* JADX INFO: renamed from: y0.a.b.a.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMediaControllerCallback.java */
        public static class C8556a implements IMediaControllerCallback {

            /* JADX INFO: renamed from: f */
            public IBinder f34153f;

            public C8556a(IBinder iBinder) {
                this.f34153f = iBinder;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: D6 */
            public void mo32D6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        parcelObtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f34153f.transact(8, parcelObtain, null, 1)) {
                        int i = a.f34152f;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: K3 */
            public void mo33K3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.f34153f.transact(2, parcelObtain, null, 1)) {
                        int i = a.f34152f;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: N3 */
            public void mo34N3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        parcelObtain.writeInt(1);
                        parcelObtain.writeBundle(mediaMetadataCompat.f58g);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f34153f.transact(4, parcelObtain, null, 1)) {
                        int i = a.f34152f;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34153f;
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: w6 */
            public void mo38w6(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f34153f.transact(3, parcelObtain, null, 1)) {
                        int i = a.f34152f;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* JADX INFO: renamed from: E0 */
        public static IMediaControllerCallback m14488E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaControllerCallback)) ? new C8556a(iBinder) : (IMediaControllerCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    ((MediaControllerCompat.AbstractC0026a.b) this).f74g.get();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo33K3();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.AbstractC0026a.b) this).mo38w6(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo34N3(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo36f2(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo37z3(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo35W1(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo32D6(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.AbstractC0026a.b) this).f74g.get();
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.AbstractC0026a.b) this).f74g.get();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.AbstractC0026a.b) this).f74g.get();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.AbstractC0026a.b) this).f74g.get();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: D6 */
    void mo32D6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* JADX INFO: renamed from: K3 */
    void mo33K3() throws RemoteException;

    /* JADX INFO: renamed from: N3 */
    void mo34N3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* JADX INFO: renamed from: W1 */
    void mo35W1(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: f2 */
    void mo36f2(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    /* JADX INFO: renamed from: w6 */
    void mo38w6(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* JADX INFO: renamed from: z3 */
    void mo37z3(CharSequence charSequence) throws RemoteException;
}
