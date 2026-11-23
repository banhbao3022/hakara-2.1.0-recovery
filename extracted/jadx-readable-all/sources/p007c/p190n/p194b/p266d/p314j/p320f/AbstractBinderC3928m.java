package p007c.p190n.p194b.p266d.p314j.p320f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p636z0.p767w.p768a.MediaRouteSelector;
import p636z0.p767w.p768a.MediaRouter;

/* JADX INFO: renamed from: c.n.b.d.j.f.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3928m extends BinderC3808a implements InterfaceC3898j {
    public AbstractBinderC3928m() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        MediaRouter.b bVar;
        boolean z;
        InterfaceC3918l c3938n = null;
        Bundle bundle = null;
        int i3 = 0;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) C4016v.m9267a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    c3938n = iInterfaceQueryLocalInterface instanceof InterfaceC3918l ? (InterfaceC3918l) iInterfaceQueryLocalInterface : new C3938n(strongBinder);
                }
                BinderC3958p binderC3958p = (BinderC3958p) this;
                MediaRouteSelector mediaRouteSelectorM16809b = MediaRouteSelector.m16809b(bundle2);
                if (!binderC3958p.f22835g.containsKey(mediaRouteSelectorM16809b)) {
                    binderC3958p.f22835g.put(mediaRouteSelectorM16809b, new HashSet());
                }
                binderC3958p.f22835g.get(mediaRouteSelectorM16809b).add(new C3948o(c3938n));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) C4016v.m9267a(parcel, Bundle.CREATOR);
                int i4 = parcel.readInt();
                BinderC3958p binderC3958p2 = (BinderC3958p) this;
                MediaRouteSelector mediaRouteSelectorM16809b2 = MediaRouteSelector.m16809b(bundle3);
                for (MediaRouter.a aVar : binderC3958p2.f22835g.get(mediaRouteSelectorM16809b2)) {
                    MediaRouter mediaRouter = binderC3958p2.f22834f;
                    Objects.requireNonNull(mediaRouter);
                    if (mediaRouteSelectorM16809b2 == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    if (aVar == null) {
                        throw new IllegalArgumentException("callback must not be null");
                    }
                    MediaRouter.m16813a();
                    if (MediaRouter.f38830a) {
                        Log.d("MediaRouter", "addCallback: selector=" + mediaRouteSelectorM16809b2 + ", callback=" + aVar + ", flags=" + Integer.toHexString(i4));
                    }
                    int iM16814b = mediaRouter.m16814b(aVar);
                    if (iM16814b < 0) {
                        bVar = new MediaRouter.b(mediaRouter, aVar);
                        mediaRouter.f38833d.add(bVar);
                    } else {
                        bVar = mediaRouter.f38833d.get(iM16814b);
                    }
                    int i5 = bVar.f38837d;
                    if (((~i5) & i4) != 0) {
                        bVar.f38837d = i5 | i4;
                        z = true;
                    } else {
                        z = false;
                    }
                    MediaRouteSelector mediaRouteSelector = bVar.f38836c;
                    Objects.requireNonNull(mediaRouteSelector);
                    mediaRouteSelector.m16810a();
                    mediaRouteSelectorM16809b2.m16810a();
                    if (!mediaRouteSelector.f38828c.containsAll(mediaRouteSelectorM16809b2.f38828c)) {
                        MediaRouteSelector.a aVar2 = new MediaRouteSelector.a(bVar.f38836c);
                        aVar2.m16811a(mediaRouteSelectorM16809b2);
                        bVar.f38836c = aVar2.m16812b();
                        z = true;
                    }
                    if (z) {
                        MediaRouter.f38831b.m16825i();
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle4 = (Bundle) C4016v.m9267a(parcel, Bundle.CREATOR);
                BinderC3958p binderC3958p3 = (BinderC3958p) this;
                Iterator<MediaRouter.a> it = binderC3958p3.f22835g.get(MediaRouteSelector.m16809b(bundle4)).iterator();
                while (it.hasNext()) {
                    binderC3958p3.f22834f.m16815c(it.next());
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle5 = (Bundle) C4016v.m9267a(parcel, Bundle.CREATOR);
                int i6 = parcel.readInt();
                MediaRouter mediaRouter2 = ((BinderC3958p) this).f22834f;
                MediaRouteSelector mediaRouteSelectorM16809b3 = MediaRouteSelector.m16809b(bundle5);
                Objects.requireNonNull(mediaRouter2);
                if (mediaRouteSelectorM16809b3 == null) {
                    throw new IllegalArgumentException("selector must not be null");
                }
                MediaRouter.m16813a();
                MediaRouter.d dVar = MediaRouter.f38831b;
                Objects.requireNonNull(dVar);
                mediaRouteSelectorM16809b3.m16810a();
                if (!mediaRouteSelectorM16809b3.f38828c.isEmpty()) {
                    if ((i6 & 2) == 0 && dVar.f38848k) {
                        i3 = 1;
                    } else {
                        int size = dVar.f38840c.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            MediaRouter.g gVar = dVar.f38840c.get(i7);
                            if ((i6 & 1) != 0) {
                                Objects.requireNonNull(gVar);
                                MediaRouter.m16813a();
                                if ((MediaRouter.f38831b.m16820d() == gVar) || gVar.f38886n == 3 || (TextUtils.equals(gVar.m16835a().f38813b.f38821a.getPackageName(), "android") && gVar.m16841h("android.media.intent.category.LIVE_AUDIO") && !gVar.m16841h("android.media.intent.category.LIVE_VIDEO"))) {
                                    continue;
                                } else if (gVar.m16837c(mediaRouteSelectorM16809b3)) {
                                    i3 = 1;
                                }
                            } else if (gVar.m16837c(mediaRouteSelectorM16809b3)) {
                                i3 = 1;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 5:
                String string = parcel.readString();
                BinderC3958p binderC3958p4 = (BinderC3958p) this;
                Objects.requireNonNull(binderC3958p4.f22834f);
                MediaRouter.m16813a();
                for (MediaRouter.g gVar2 : MediaRouter.f38831b.f38840c) {
                    if (gVar2.f38875c.equals(string)) {
                        binderC3958p4.f22834f.m16816d(gVar2);
                        parcel2.writeNoException();
                        return true;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                MediaRouter mediaRouter3 = ((BinderC3958p) this).f22834f;
                Objects.requireNonNull(mediaRouter3);
                MediaRouter.m16813a();
                mediaRouter3.m16816d(MediaRouter.f38831b.m16820d());
                parcel2.writeNoException();
                return true;
            case 7:
                BinderC3958p binderC3958p5 = (BinderC3958p) this;
                Objects.requireNonNull(binderC3958p5.f22834f);
                MediaRouter.m16813a();
                String str = MediaRouter.f38831b.m16821e().f38875c;
                Objects.requireNonNull(binderC3958p5.f22834f);
                MediaRouter.m16813a();
                boolean zEquals = str.equals(MediaRouter.f38831b.m16820d().f38875c);
                parcel2.writeNoException();
                int i8 = C4016v.f22903a;
                parcel2.writeInt(zEquals ? 1 : 0);
                return true;
            case 8:
                String string2 = parcel.readString();
                Objects.requireNonNull(((BinderC3958p) this).f22834f);
                MediaRouter.m16813a();
                for (MediaRouter.g gVar3 : MediaRouter.f38831b.f38840c) {
                    if (gVar3.f38875c.equals(string2)) {
                        bundle = gVar3.f38891s;
                        parcel2.writeNoException();
                        C4016v.m9270d(parcel2, bundle);
                        return true;
                    }
                }
                parcel2.writeNoException();
                C4016v.m9270d(parcel2, bundle);
                return true;
            case 9:
                Objects.requireNonNull(((BinderC3958p) this).f22834f);
                MediaRouter.m16813a();
                String str2 = MediaRouter.f38831b.m16821e().f38875c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            case 11:
                BinderC3958p binderC3958p6 = (BinderC3958p) this;
                Iterator<Set<MediaRouter.a>> it2 = binderC3958p6.f22835g.values().iterator();
                while (it2.hasNext()) {
                    Iterator<MediaRouter.a> it3 = it2.next().iterator();
                    while (it3.hasNext()) {
                        binderC3958p6.f22834f.m16815c(it3.next());
                    }
                }
                binderC3958p6.f22835g.clear();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
