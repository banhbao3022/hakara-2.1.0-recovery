package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback;
import p629y0.p630a.p632b.p633a.p634a.IMediaSession;
import p636z0.p692g0.ParcelUtils;
import p636z0.p692g0.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0027b f64a;

    /* JADX INFO: renamed from: b */
    public final MediaSessionCompat.Token f65b;

    public static class MediaControllerImplApi21 implements InterfaceC0027b {

        /* JADX INFO: renamed from: a */
        public final MediaController f66a;

        /* JADX INFO: renamed from: b */
        public final Object f67b = new Object();

        /* JADX INFO: renamed from: c */
        public final List<AbstractC0026a> f68c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public HashMap<AbstractC0026a, BinderC0025a> f69d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public final MediaSessionCompat.Token f70e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: f */
            public WeakReference<MediaControllerImplApi21> f71f;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f71f = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f71f.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f67b) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.f70e;
                    IMediaSession iMediaSessionM14489E0 = IMediaSession.a.m14489E0(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
                    synchronized (token.f83f) {
                        token.f85h = iMediaSessionM14489E0;
                    }
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.f70e;
                    VersionedParcelable versionedParcelable = null;
                    try {
                        Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                        if (bundle2 != null) {
                            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
                            Parcelable parcelable = bundle2.getParcelable("a");
                            if (!(parcelable instanceof ParcelImpl)) {
                                throw new IllegalArgumentException("Invalid parcel");
                            }
                            versionedParcelable = ((ParcelImpl) parcelable).f1216f;
                        }
                    } catch (RuntimeException unused) {
                    }
                    synchronized (token2.f83f) {
                        token2.f86i = versionedParcelable;
                    }
                    mediaControllerImplApi21.m31b();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class BinderC0025a extends AbstractC0026a.b {
            public BinderC0025a(AbstractC0026a abstractC0026a) {
                super(abstractC0026a);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0026a.b, p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: D6 */
            public void mo32D6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0026a.b, p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: K3 */
            public void mo33K3() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0026a.b, p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: N3 */
            public void mo34N3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0026a.b, p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: W1 */
            public void mo35W1(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0026a.b, p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: f2 */
            public void mo36f2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0026a.b, p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: z3 */
            public void mo37z3(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f70e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f84g);
            this.f66a = mediaController;
            if (token.m47b() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m30a(KeyEvent keyEvent) {
            return this.f66a.dispatchMediaButtonEvent(keyEvent);
        }

        /* JADX INFO: renamed from: b */
        public void m31b() {
            if (this.f70e.m47b() == null) {
                return;
            }
            for (AbstractC0026a abstractC0026a : this.f68c) {
                BinderC0025a binderC0025a = new BinderC0025a(abstractC0026a);
                this.f69d.put(abstractC0026a, binderC0025a);
                abstractC0026a.f72a = binderC0025a;
                try {
                    this.f70e.m47b().mo99b1(binderC0025a);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f68c.clear();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0026a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public IMediaControllerCallback f72a;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public static class a extends MediaController.Callback {

            /* JADX INFO: renamed from: a */
            public final WeakReference<AbstractC0026a> f73a;

            public a(AbstractC0026a abstractC0026a) {
                this.f73a = new WeakReference<>(abstractC0026a);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f73a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m39a(bundle);
                this.f73a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (this.f73a.get() != null) {
                    MediaMetadataCompat.m25a(mediaMetadata);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                ArrayList arrayList;
                PlaybackStateCompat.CustomAction customAction;
                AbstractC0026a abstractC0026a = this.f73a.get();
                if (abstractC0026a == null || abstractC0026a.f72a != null) {
                    return;
                }
                Bundle extras = null;
                if (playbackState != null) {
                    List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
                    if (customActions != null) {
                        ArrayList arrayList2 = new ArrayList(customActions.size());
                        for (PlaybackState.CustomAction customAction2 : customActions) {
                            if (customAction2 != null) {
                                PlaybackState.CustomAction customAction3 = customAction2;
                                Bundle extras2 = customAction3.getExtras();
                                MediaSessionCompat.m39a(extras2);
                                customAction = new PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), extras2);
                                customAction.f126j = customAction3;
                            } else {
                                customAction = null;
                            }
                            arrayList2.add(customAction);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        extras = playbackState.getExtras();
                        MediaSessionCompat.m39a(extras);
                    }
                    new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras).f121q = playbackState;
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (this.f73a.get() == null || list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (MediaSession.QueueItem queueItem2 : list) {
                    if (queueItem2 != null) {
                        MediaSession.QueueItem queueItem3 = queueItem2;
                        queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.m24a(queueItem3.getDescription()), queueItem3.getQueueId());
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                this.f73a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                this.f73a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m39a(bundle);
                AbstractC0026a abstractC0026a = this.f73a.get();
                if (abstractC0026a == null || abstractC0026a.f72a == null) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class b extends IMediaControllerCallback.a {

            /* JADX INFO: renamed from: g */
            public final WeakReference<AbstractC0026a> f74g;

            public b(AbstractC0026a abstractC0026a) {
                this.f74g = new WeakReference<>(abstractC0026a);
            }

            /* JADX INFO: renamed from: D6 */
            public void mo32D6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                if (this.f74g.get() == null || parcelableVolumeInfo == null) {
                    return;
                }
                int i = parcelableVolumeInfo.f106g;
                AudioAttributesCompat.C0127a c0127a = new AudioAttributesCompat.C0127a();
                c0127a.f801a.mo442b(i);
                c0127a.f801a.mo441a();
            }

            /* JADX INFO: renamed from: K3 */
            public void mo33K3() throws RemoteException {
                this.f74g.get();
            }

            /* JADX INFO: renamed from: N3 */
            public void mo34N3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                this.f74g.get();
            }

            /* JADX INFO: renamed from: W1 */
            public void mo35W1(Bundle bundle) throws RemoteException {
                this.f74g.get();
            }

            /* JADX INFO: renamed from: f2 */
            public void mo36f2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                this.f74g.get();
            }

            @Override // p629y0.p630a.p632b.p633a.p634a.IMediaControllerCallback
            /* JADX INFO: renamed from: w6 */
            public void mo38w6(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                this.f74g.get();
            }

            /* JADX INFO: renamed from: z3 */
            public void mo37z3(CharSequence charSequence) throws RemoteException {
                this.f74g.get();
            }
        }

        public AbstractC0026a() {
            new a(this);
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public interface InterfaceC0027b {
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        new ConcurrentHashMap();
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token tokenM42b = mediaSessionCompat.m42b();
        this.f65b = tokenM42b;
        this.f64a = new MediaControllerImplApi21(context, tokenM42b);
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        new ConcurrentHashMap();
        if (token != null) {
            this.f65b = token;
            this.f64a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
