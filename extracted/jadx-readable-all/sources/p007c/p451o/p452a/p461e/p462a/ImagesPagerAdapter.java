package p007c.p451o.p452a.p461e.p462a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p007c.p187m.p188a.p189a.PhotoView;
import p007c.p451o.p452a.p453c.p459c.RecyclingPagerAdapter;
import p007c.p451o.p452a.p460d.ImageLoader;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.o.a.e.a.a, reason: use source file name */
/* JADX INFO: compiled from: ImagesPagerAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImagesPagerAdapter<T> extends RecyclingPagerAdapter<ImagesPagerAdapter<T>.a> {

    /* JADX INFO: renamed from: e */
    public List<? extends T> f27861e;

    /* JADX INFO: renamed from: f */
    public final List<ImagesPagerAdapter<T>.a> f27862f;

    /* JADX INFO: renamed from: g */
    public final Context f27863g;

    /* JADX INFO: renamed from: h */
    public final ImageLoader<T> f27864h;

    /* JADX INFO: renamed from: i */
    public final boolean f27865i;

    /* JADX INFO: renamed from: c.o.a.e.a.a$a */
    /* JADX INFO: compiled from: ImagesPagerAdapter.kt */
    public final class a extends RecyclingPagerAdapter.c {

        /* JADX INFO: renamed from: e */
        public final PhotoView f27866e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImagesPagerAdapter f27867f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImagesPagerAdapter imagesPagerAdapter, View view) {
            super(view);
            Intrinsics2.m13090f(view, "itemView");
            this.f27867f = imagesPagerAdapter;
            this.f27866e = (PhotoView) view;
        }
    }

    public ImagesPagerAdapter(Context context, List<? extends T> list, ImageLoader<T> imageLoader, boolean z) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(list, "_images");
        Intrinsics2.m13090f(imageLoader, "imageLoader");
        this.f27863g = context;
        this.f27864h = imageLoader;
        this.f27865i = z;
        this.f27861e = list;
        this.f27862f = new ArrayList();
    }

    @Override // p007c.p451o.p452a.p453c.p459c.RecyclingPagerAdapter
    /* JADX INFO: renamed from: l */
    public int mo12486l() {
        return this.f27861e.size();
    }

    @Override // p007c.p451o.p452a.p453c.p459c.RecyclingPagerAdapter
    /* JADX INFO: renamed from: m */
    public void mo12487m(RecyclingPagerAdapter.c cVar, int i) {
        a aVar = (a) cVar;
        Intrinsics2.m13090f(aVar, "holder");
        aVar.f27858b = i;
        ImagesPagerAdapter imagesPagerAdapter = aVar.f27867f;
        imagesPagerAdapter.f27864h.mo12489a(aVar.f27866e, imagesPagerAdapter.f27861e.get(i));
    }

    @Override // p007c.p451o.p452a.p453c.p459c.RecyclingPagerAdapter
    /* JADX INFO: renamed from: n */
    public RecyclingPagerAdapter.c mo12488n(ViewGroup viewGroup, int i) {
        Intrinsics2.m13090f(viewGroup, "parent");
        PhotoView photoView = new PhotoView(this.f27863g);
        photoView.setEnabled(this.f27865i);
        photoView.setOnViewDragListener(new ImagesPagerAdapter2(photoView));
        ImagesPagerAdapter<T>.a aVar = new a(this, photoView);
        this.f27862f.add(aVar);
        return aVar;
    }
}
