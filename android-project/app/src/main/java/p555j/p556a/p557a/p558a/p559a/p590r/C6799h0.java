package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Duet2;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Simple2;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetAnyResponse4;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p555j.p556a.p557a.p606h.p614e.SongRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.r.h0 */
/* JADX INFO: compiled from: SingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6799h0 extends BaseViewModel {

    /* JADX INFO: renamed from: A */
    public final SongRepository f31856A;

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<Song> f31857l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<Integer> f31858m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Recording> f31859n;

    /* JADX INFO: renamed from: o */
    public final MutableLiveData<ArrayList<Duet2>> f31860o;

    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Recording> f31861p;

    /* JADX INFO: renamed from: q */
    public final MutableLiveData<User> f31862q;

    /* JADX INFO: renamed from: r */
    public final MutableLiveData<User> f31863r;

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<User> f31864s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<ArrayList<Simple2>> f31865t;

    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Duet> f31866u;

    /* JADX INFO: renamed from: v */
    public final MutableLiveData<GetAnyResponse4> f31867v;

    /* JADX INFO: renamed from: w */
    public final MutableLiveData<ArrayList<User>> f31868w;

    /* JADX INFO: renamed from: x */
    public final MutableLiveData<RecordingEntity> f31869x;

    /* JADX INFO: renamed from: y */
    public final MutableLiveData<Long> f31870y;

    /* JADX INFO: renamed from: z */
    public final RecordingRepository f31871z;

    /* JADX INFO: renamed from: j.a.a.a.a.r.h0$a */
    /* JADX INFO: compiled from: SingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$createSongFromYoutube$1", m13069f = "SingViewModel.kt", m13070l = {150, 161}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31872j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ int f31874l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f31875m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ File f31876n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ boolean f31877o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, File file, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f31874l = i;
            this.f31875m = i2;
            this.f31876n = file;
            this.f31877o = z;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return C6799h0.this.new a(this.f31874l, this.f31875m, this.f31876n, this.f31877o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31872j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                HashMap<String, RequestBody> map = new HashMap<>();
                RequestBody.a aVar = RequestBody.f29980a;
                map.put("type", RequestBody.a.m13329c(aVar, String.valueOf(this.f31874l), null, 1));
                map.put("song_id", RequestBody.a.m13329c(aVar, String.valueOf(this.f31875m), null, 1));
                File file = this.f31876n;
                MediaType2.a aVar2 = MediaType2.f30664c;
                RequestBody requestBodyM13330a = aVar.m13330a(file, aVar2.m13688b("audio/*"));
                if (this.f31874l == 1) {
                    requestBodyM13330a = aVar.m13330a(this.f31876n, aVar2.m13688b("video/*"));
                }
                MultipartBody.c cVarM13695b = MultipartBody.c.f30682a.m13695b("file", this.f31876n.getName(), requestBodyM13330a);
                RecordingRepository recordingRepository = C6799h0.this.f31871z;
                this.f31872j = 1;
                obj = recordingRepository.mo14190b(cVarM13695b, map, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                if (((GetAnyResponse) obj).getResults() != null) {
                    Intrinsics2.m13089e("createSongFromYoutube success", "message");
                    if (this.f31877o) {
                        this.f31876n.delete();
                    }
                }
            } catch (Exception e) {
                Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
                C6799h0 c6799h0 = C6799h0.this;
                this.f31872j = 2;
                if (c6799h0.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.r.h0$b */
    /* JADX INFO: compiled from: SingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$sendInviteDuet$1", m13069f = "SingViewModel.kt", m13070l = {181, 184}, m13071m = "invokeSuspend")
    public static final class b extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31878j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ HashMap f31880l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31880l = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return C6799h0.this.new b(this.f31880l, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return C6799h0.this.new b(this.f31880l, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31878j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                RecordingRepository recordingRepository = C6799h0.this.f31871z;
                HashMap<String, Object> map = this.f31880l;
                this.f31878j = 1;
                if (recordingRepository.mo14186A(map, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
                C6799h0 c6799h0 = C6799h0.this;
                this.f31878j = 2;
                if (c6799h0.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.r.h0$c */
    /* JADX INFO: compiled from: SingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$updateLocalRecording$1", m13069f = "SingViewModel.kt", m13070l = {264, 267}, m13071m = "invokeSuspend")
    public static final class c extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31881j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ RecordingEntity f31883l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecordingEntity recordingEntity, Continuation continuation) {
            super(2, continuation);
            this.f31883l = recordingEntity;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return C6799h0.this.new c(this.f31883l, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return C6799h0.this.new c(this.f31883l, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31881j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                RecordingRepository recordingRepository = C6799h0.this.f31871z;
                RecordingEntity recordingEntity = this.f31883l;
                this.f31881j = 1;
                if (recordingRepository.mo14196h(recordingEntity, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
                C6799h0 c6799h0 = C6799h0.this;
                this.f31881j = 2;
                if (c6799h0.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public C6799h0(RecordingRepository recordingRepository, SongRepository songRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        Intrinsics2.m13089e(songRepository, "songRepository");
        this.f31871z = recordingRepository;
        this.f31856A = songRepository;
        this.f31857l = new MutableLiveData<>();
        this.f31858m = new MutableLiveData<>();
        this.f31859n = new MutableLiveData<>();
        this.f31860o = new MutableLiveData<>();
        this.f31861p = new MutableLiveData<>();
        this.f31862q = new MutableLiveData<>();
        this.f31863r = new MutableLiveData<>();
        this.f31864s = new MutableLiveData<>();
        this.f31865t = new MutableLiveData<>();
        this.f31866u = new MutableLiveData<>();
        this.f31867v = new MutableLiveData<>();
        this.f31868w = new MutableLiveData<>();
        this.f31869x = new MutableLiveData<>();
        new MutableLiveData();
        this.f31870y = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o */
    public final void m13949o(File file, int i, int i2, boolean z) {
        Intrinsics2.m13089e(file, "file");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i2, i, file, z, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m13950p(HashMap<String, Object> map) {
        Intrinsics2.m13089e(map, "hashMap");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new b(map, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m13951q(RecordingEntity recordingEntity) {
        Intrinsics2.m13089e(recordingEntity, "recordingEntity");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new c(recordingEntity, null), 3, null);
    }
}
