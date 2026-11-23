package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import p636z0.p641a0.IMultiInstanceInvalidationCallback;
import p636z0.p641a0.IMultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: f */
    public int f1162f = 0;

    /* JADX INFO: renamed from: g */
    public final HashMap<Integer, String> f1163g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> f1164h = new RemoteCallbackListC0180a();

    /* JADX INFO: renamed from: i */
    public final IMultiInstanceInvalidationService.a f1165i = new BinderC0181b();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class RemoteCallbackListC0180a extends RemoteCallbackList<IMultiInstanceInvalidationCallback> {
        public RemoteCallbackListC0180a() {
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.f1163g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class BinderC0181b extends IMultiInstanceInvalidationService.a {
        public BinderC0181b() {
        }

        @Override // p636z0.p641a0.IMultiInstanceInvalidationService
        /* JADX INFO: renamed from: S5 */
        public void mo865S5(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1164h) {
                try {
                    String str = MultiInstanceInvalidationService.this.f1163g.get(Integer.valueOf(i));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f1164h.beginBroadcast();
                    for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                        try {
                            int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f1164h.getBroadcastCookie(i2)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f1163g.get(Integer.valueOf(iIntValue));
                            if (i != iIntValue && str.equals(str2)) {
                                try {
                                    ((IMultiInstanceInvalidationCallback) MultiInstanceInvalidationService.this.f1164h.getBroadcastItem(i2)).mo14514L1(strArr);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f1164h.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f1164h.finishBroadcast();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p636z0.p641a0.IMultiInstanceInvalidationService
        /* JADX INFO: renamed from: j2 */
        public int mo866j2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1164h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f1162f + 1;
                multiInstanceInvalidationService.f1162f = i;
                if (multiInstanceInvalidationService.f1164h.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f1163g.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService.this.f1162f--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1165i;
    }
}
