package p555j.p556a.p557a.p558a.p559a.p590r;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import p001a1.p002a.p003a.Compressor;
import p001a1.p002a.p003a.Compressor2;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref3;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;

/* JADX INFO: renamed from: j.a.a.a.a.r.g0 */
/* JADX INFO: compiled from: SingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$createRecording$1", m13069f = "SingViewModel.kt", m13070l = {115, 123, 130}, m13071m = "invokeSuspend")
public final class C6797g0 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31844j;

    /* JADX INFO: renamed from: k */
    public Object f31845k;

    /* JADX INFO: renamed from: l */
    public Object f31846l;

    /* JADX INFO: renamed from: m */
    public int f31847m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C6799h0 f31848n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ File f31849o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f31850p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ File f31851q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Uri f31852r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f31853s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ HashMap f31854t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6797g0(C6799h0 c6799h0, File file, int i, File file2, Uri uri, Context context, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.f31848n = c6799h0;
        this.f31849o = file;
        this.f31850p = i;
        this.f31851q = file2;
        this.f31852r = uri;
        this.f31853s = context;
        this.f31854t = map;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new C6797g0(this.f31848n, this.f31849o, this.f31850p, this.f31851q, this.f31852r, this.f31853s, this.f31854t, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C6797g0) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0106 A[Catch: Exception -> 0x010e, TRY_LEAVE, TryCatch #0 {Exception -> 0x010e, blocks: (B:10:0x001d, B:34:0x00fc, B:36:0x0106, B:13:0x002e, B:29:0x00b9, B:31:0x00dc, B:16:0x0036, B:19:0x004c, B:20:0x0056, B:22:0x006f, B:23:0x0083, B:25:0x008e), top: B:44:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [T, g1.z$c] */
    /* JADX WARN: Type inference failed for: r13v8, types: [T, g1.z$c] */
    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Ref3 ref3;
        Ref3 ref4;
        MultipartBody.c cVar;
        MultipartBody.c cVar2;
        Ref3 ref5;
        Ref3 ref6;
        Recording recording;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31847m;
        try {
            if (i != 0) {
                if (i == 1) {
                    ref5 = (Ref3) this.f31846l;
                    ref6 = (Ref3) this.f31845k;
                    cVar2 = (MultipartBody.c) this.f31844j;
                    C5729a.m12442O(obj);
                } else if (i == 2) {
                    C5729a.m12442O(obj);
                    recording = (Recording) ((GetItemResponse) obj).getResults();
                    if (recording != null) {
                        this.f31848n.f31861p.mo427j(recording);
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            RequestBody.a aVar = RequestBody.f29980a;
            File file = this.f31849o;
            MediaType2.a aVar2 = MediaType2.f30664c;
            RequestBody requestBodyM13330a = aVar.m13330a(file, aVar2.m13688b("audio/*"));
            if (this.f31850p == 1) {
                requestBodyM13330a = aVar.m13330a(this.f31849o, aVar2.m13688b("video/*"));
            }
            MultipartBody.c.a aVar3 = MultipartBody.c.f30682a;
            MultipartBody.c cVarM13695b = aVar3.m13695b("audio", this.f31849o.getName(), requestBodyM13330a);
            ref3 = new Ref3();
            ref3.f29604f = null;
            File file2 = this.f31851q;
            if (file2 != null) {
                ref3.f29604f = aVar3.m13695b("video_resize", file2.getName(), aVar.m13330a(file2, aVar2.m13688b("video/*")));
            }
            ref4 = new Ref3();
            ref4.f29604f = null;
            Uri uri = this.f31852r;
            if (uri != null) {
                File file3 = new File(String.valueOf(uri.getPath()));
                Context context = this.f31853s;
                this.f31844j = cVarM13695b;
                this.f31845k = ref3;
                this.f31846l = ref4;
                this.f31847m = 1;
                Object objM12445R = C5729a.m12445R(Dispatchers.f29770b, new Compressor2(Compressor.f3g, context, file3, null), this);
                if (objM12445R == intrinsics) {
                    return intrinsics;
                }
                cVar2 = cVarM13695b;
                ref5 = ref4;
                obj = objM12445R;
                ref6 = ref3;
            } else {
                cVar = cVarM13695b;
            }
            RecordingRepository recordingRepository = this.f31848n.f31871z;
            HashMap<String, RequestBody> map = this.f31854t;
            MultipartBody.c cVar3 = (MultipartBody.c) ref3.f29604f;
            MultipartBody.c cVar4 = (MultipartBody.c) ref4.f29604f;
            this.f31844j = null;
            this.f31845k = null;
            this.f31846l = null;
            this.f31847m = 2;
            obj = recordingRepository.mo14199k(cVar, map, cVar3, cVar4, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            recording = (Recording) ((GetItemResponse) obj).getResults();
            if (recording != null) {
                this.f31848n.f31861p.mo427j(recording);
            }
            return Unit.f29502a;
            File file4 = (File) obj;
            ref5.f29604f = MultipartBody.c.f30682a.m13695b("thumbnail", file4.getName(), RequestBody.f29980a.m13330a(file4, MediaType2.f30664c.m13688b("image/png")));
            ref4 = ref5;
            ref3 = ref6;
            cVar = cVar2;
            RecordingRepository recordingRepository2 = this.f31848n.f31871z;
            HashMap<String, RequestBody> map2 = this.f31854t;
            MultipartBody.c cVar5 = (MultipartBody.c) ref3.f29604f;
            MultipartBody.c cVar6 = (MultipartBody.c) ref4.f29604f;
            this.f31844j = null;
            this.f31845k = null;
            this.f31846l = null;
            this.f31847m = 2;
            obj = recordingRepository2.mo14199k(cVar, map2, cVar5, cVar6, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            recording = (Recording) ((GetItemResponse) obj).getResults();
            if (recording != null) {
                this.f31848n.f31861p.mo427j(recording);
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            C6799h0 c6799h0 = this.f31848n;
            this.f31844j = null;
            this.f31845k = null;
            this.f31846l = null;
            this.f31847m = 3;
            if (c6799h0.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
