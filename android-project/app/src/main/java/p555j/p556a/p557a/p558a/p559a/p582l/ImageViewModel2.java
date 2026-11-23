package p555j.p556a.p557a.p558a.p559a.p582l;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Image;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
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
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.l.k, reason: use source file name */
/* JADX INFO: compiled from: ImageViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageViewModel2 extends BaseLoadMoreRefreshViewModel<Image> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31632s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Image> f31633t;

    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Boolean> f31634u;

    /* JADX INFO: renamed from: v */
    public final UserRepository f31635v;

    /* JADX INFO: renamed from: j.a.a.a.a.l.k$a */
    /* JADX INFO: compiled from: ImageViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.image.ImageViewModel$loadData$2", m13069f = "ImageViewModel.kt", m13070l = {42, 42, 44}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31636j;

        /* JADX INFO: renamed from: k */
        public int f31637k;

        /* JADX INFO: renamed from: l */
        public int f31638l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31640n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31641o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31640n = i;
            this.f31641o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ImageViewModel2.this.new a(this.f31640n, this.f31641o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ImageViewModel2.this.new a(this.f31640n, this.f31641o, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            ImageViewModel2 imageViewModel2;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31638l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31637k;
                        imageViewModel2 = (ImageViewModel2) this.f31636j;
                        C5729a.m12442O(obj);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                ImageViewModel2 imageViewModel3 = ImageViewModel2.this;
                i = this.f31640n;
                UserRepository userRepository = imageViewModel3.f31635v;
                HashMap<String, String> map = this.f31641o;
                this.f31636j = imageViewModel3;
                this.f31637k = i;
                this.f31638l = 1;
                Object objMo14222F = userRepository.mo14222F(map, this);
                if (objMo14222F == intrinsics) {
                    return intrinsics;
                }
                imageViewModel2 = imageViewModel3;
                obj = objMo14222F;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31636j = null;
                this.f31638l = 2;
                if (imageViewModel2.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                ImageViewModel2 imageViewModel4 = ImageViewModel2.this;
                this.f31636j = null;
                this.f31638l = 3;
                if (imageViewModel4.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.l.k$b */
    /* JADX INFO: compiled from: ImageViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.image.ImageViewModel$uploadImage$1", m13069f = "ImageViewModel.kt", m13070l = {54, 62, 65}, m13071m = "invokeSuspend")
    public static final class b extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31642j;

        /* JADX INFO: renamed from: k */
        public int f31643k;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ Uri f31645m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ Context f31646n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, Context context, Continuation continuation) {
            super(2, continuation);
            this.f31645m = uri;
            this.f31646n = context;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ImageViewModel2.this.new b(this.f31645m, this.f31646n, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ImageViewModel2.this.new b(this.f31645m, this.f31646n, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            MutableLiveData mutableLiveData;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31643k;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else if (i == 2) {
                        mutableLiveData = (MutableLiveData) this.f31642j;
                        C5729a.m12442O(obj);
                        mutableLiveData.mo427j(((GetItemResponse) obj).getResults());
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                File file = new File(String.valueOf(this.f31645m.getPath()));
                Context context = this.f31646n;
                this.f31643k = 1;
                obj = C5729a.m12445R(Dispatchers.f29770b, new Compressor2(Compressor.f3g, context, file, null), this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                File file2 = (File) obj;
                MultipartBody.c cVarM13695b = MultipartBody.c.f30682a.m13695b("image", file2.getName(), RequestBody.f29980a.m13330a(file2, MediaType2.f30664c.m13688b("image/png")));
                ImageViewModel2 imageViewModel2 = ImageViewModel2.this;
                MutableLiveData<Image> mutableLiveData2 = imageViewModel2.f31633t;
                UserRepository userRepository = imageViewModel2.f31635v;
                this.f31642j = mutableLiveData2;
                this.f31643k = 2;
                obj = userRepository.mo14234q(cVarM13695b, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                mutableLiveData = mutableLiveData2;
                mutableLiveData.mo427j(((GetItemResponse) obj).getResults());
                return Unit.f29502a;
            } catch (Exception e) {
                Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
                ImageViewModel2 imageViewModel3 = ImageViewModel2.this;
                this.f31642j = null;
                this.f31643k = 3;
                if (imageViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
        }
    }

    public ImageViewModel2(UserRepository userRepository) {
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31635v = userRepository;
        this.f31632s = new MutableLiveData<>();
        this.f31633t = new MutableLiveData<>();
        this.f31634u = new MutableLiveData<>();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("per_page", "16");
        Integer numM421d = this.f31632s.m421d();
        if (numM421d != null && Intrinsics2.m13091g(numM421d.intValue(), 0) > 0) {
            map.put("user_id", String.valueOf(this.f31632s.m421d()));
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m13935w(Context context, Uri uri) {
        Intrinsics2.m13089e(context, "content");
        Intrinsics2.m13089e(uri, "uri");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new b(uri, context, null), 3, null);
    }
}
