package p555j.p556a.p557a.p558a.p559a.p573i;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import mtp.media.karaoke.R;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.i.v */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6704v implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6693k f31498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f31499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31500c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f31501d;

    /* JADX INFO: renamed from: j.a.a.a.a.i.v$a */
    /* JADX INFO: compiled from: ProfileRecordingFragment.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileRecordingFragment$recordingConverter$1$1", m13069f = "ProfileRecordingFragment.kt", m13070l = {403}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31502j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ File f31503k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, Continuation continuation) {
            super(2, continuation);
            this.f31503k = file;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new a(this.f31503k, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new a(this.f31503k, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31502j;
            if (i == 0) {
                C5729a.m12442O(obj);
                this.f31502j = 1;
                if (C5729a.m12457l(5000L, this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            this.f31503k.delete();
            return Unit.f29502a;
        }
    }

    public C6704v(C6693k c6693k, String str, String str2, File file) {
        this.f31498a = c6693k;
        this.f31499b = str;
        this.f31500c = str2;
        this.f31501d = file;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) throws IOException {
        if (i != 0) {
            String str = String.format("Async command execution failed with returnCode=%d.", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
            Intrinsics2.m13089e(str, "message");
            return;
        }
        File file = new File(this.f31499b);
        if (file.exists()) {
            PathUtils.m14256b(file, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/" + this.f31500c + C7804v0.m15335x(3));
            CoroutineScope2 coroutineScope2 = CoroutineScope2.f29811f;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            C5729a.m12428A(coroutineScope2, MainDispatchers.f29666b, 0, new a(file, null), 2, null);
            FragmentActivity fragmentActivityM16562f = this.f31498a.m16562f();
            if (fragmentActivityM16562f != null) {
                SkuDao.a.m14069U(fragmentActivityM16562f, this.f31498a.m16546Q(R.string.title_download_recording_success), this.f31498a.m16546Q(R.string.message_download_recording_success), this.f31498a.m16546Q(R.string.f33401ok), null, null, null, false, true, 120);
            }
        }
        this.f31501d.delete();
    }
}
