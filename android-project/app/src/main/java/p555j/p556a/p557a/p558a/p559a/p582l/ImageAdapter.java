package p555j.p556a.p557a.p558a.p559a.p582l;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Image;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6169q;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemImageBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.l.e, reason: use source file name */
/* JADX INFO: compiled from: ImageAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageAdapter extends BaseListAdapter<Image, ItemImageBinding> {

    /* JADX INFO: renamed from: f */
    public int f31607f;

    /* JADX INFO: renamed from: g */
    public boolean f31608g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Image> f31609h;

    /* JADX INFO: renamed from: i */
    public boolean f31610i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6169q<Integer, ImageView, Image, Unit> f31611j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6164l<Integer, Unit> f31612k;

    /* JADX INFO: renamed from: j.a.a.a.a.l.e$a */
    /* JADX INFO: compiled from: ImageAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Integer, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31613g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Integer num) {
            num.intValue();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.l.e$b */
    /* JADX INFO: compiled from: ImageAdapter.kt */
    public static final class b extends DiffUtil.e<Image> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Image image, Image image2) {
            Image image3 = image;
            Image image4 = image2;
            Intrinsics2.m13089e(image3, "oldItem");
            Intrinsics2.m13089e(image4, "newItem");
            return Intrinsics2.m13085a(image3, image4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Image image, Image image2) {
            Image image3 = image;
            Image image4 = image2;
            Intrinsics2.m13089e(image3, "oldItem");
            Intrinsics2.m13089e(image4, "newItem");
            return image3.getId() == image4.getId();
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.l.e$c */
    /* JADX INFO: compiled from: ImageAdapter.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Image f31615g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ BaseListAdapter3 f31616h;

        public c(Image image, BaseListAdapter3 baseListAdapter3) {
            this.f31615g = image;
            this.f31616h = baseListAdapter3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Image image = this.f31615g;
            if (image != null) {
                ImageAdapter imageAdapter = ImageAdapter.this;
                if (!imageAdapter.f31608g) {
                    InterfaceC6169q<Integer, ImageView, Image, Unit> interfaceC6169q = imageAdapter.f31611j;
                    Integer numValueOf = Integer.valueOf(this.f31616h.m643e());
                    AppCompatImageView appCompatImageView = ((ItemImageBinding) this.f31616h.f32043u).f32589u;
                    Intrinsics2.m13088d(appCompatImageView, "holder.binding.image");
                    interfaceC6169q.mo13079f(numValueOf, appCompatImageView, image);
                    return;
                }
                ViewBinding viewbinding = this.f31616h.f32043u;
                if (((ItemImageBinding) viewbinding).f32591w) {
                    ((ItemImageBinding) viewbinding).mo14241s(false);
                    ImageAdapter.this.f31609h.remove(image);
                    ImageView imageView = ((ItemImageBinding) this.f31616h.f32043u).f32588t;
                    Intrinsics2.m13088d(imageView, "holder.binding.iconChecked");
                    SkuDao.a.m14061M(imageView);
                } else {
                    ((ItemImageBinding) viewbinding).mo14241s(true);
                    ImageAdapter.this.f31609h.add(image);
                    ImageView imageView2 = ((ItemImageBinding) this.f31616h.f32043u).f32588t;
                    Intrinsics2.m13088d(imageView2, "holder.binding.iconChecked");
                    SkuDao.a.m14068T(imageView2);
                }
                ImageAdapter imageAdapter2 = ImageAdapter.this;
                imageAdapter2.f31612k.mo3b(Integer.valueOf(imageAdapter2.f31609h.size()));
            }
        }
    }

    public /* synthetic */ ImageAdapter(InterfaceC6169q interfaceC6169q, InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6169q, (i & 2) != 0 ? a.f31613g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_image;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemImageBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        View view = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view, "holder.itemView");
        view.getLayoutParams().width = this.f31607f;
        View view2 = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view2, "holder.itemView");
        view2.getLayoutParams().height = this.f31607f;
        Image image = (Image) this.f39339d.f39163g.get(i);
        if (this.f31610i) {
            ((ItemImageBinding) baseListAdapter3.f32043u).mo14241s(false);
            ImageView imageView = ((ItemImageBinding) baseListAdapter3.f32043u).f32588t;
            Intrinsics2.m13088d(imageView, "holder.binding.iconChecked");
            SkuDao.a.m14061M(imageView);
        }
        ((ItemImageBinding) baseListAdapter3.f32043u).f32589u.setOnClickListener(new c(image, baseListAdapter3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageAdapter(InterfaceC6169q<? super Integer, ? super ImageView, ? super Image, Unit> interfaceC6169q, InterfaceC6164l<? super Integer, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6169q, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l, "imageSelectedCount");
        this.f31611j = interfaceC6169q;
        this.f31612k = interfaceC6164l;
        this.f31609h = new ArrayList<>();
    }
}
