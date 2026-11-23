package p555j.p556a.p557a.p616i;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple5;
import p007c.p085g.p086a.Glide;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.r1, reason: use source file name */
/* JADX INFO: compiled from: ItemPrivacyBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemPrivacyBindingImpl extends ItemPrivacyBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32786y;

    /* JADX INFO: renamed from: A */
    public final TextView f32787A;

    /* JADX INFO: renamed from: B */
    public long f32788B;

    /* JADX INFO: renamed from: z */
    public final CardView f32789z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32786y = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemPrivacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32786y);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[3], (AppCompatImageView) objArrM391i[1], (ImageView) objArrM391i[2], (RelativeLayout) objArrM391i[5]);
        this.f32788B = -1L;
        this.f32762t.setTag(null);
        this.f32763u.setTag(null);
        this.f32764v.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32789z = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[4];
        this.f32787A = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        Integer localImage;
        int iM393n;
        Integer num;
        synchronized (this) {
            j2 = this.f32788B;
            this.f32788B = 0L;
        }
        Simple5 simple5 = this.f32766x;
        long j3 = j2 & 3;
        Drawable drawable = null;
        Integer description = null;
        int iM393n2 = 0;
        boolean zIsChecked = false;
        if (j3 != 0) {
            if (simple5 != null) {
                localImage = simple5.getLocalImage();
                zIsChecked = simple5.isChecked();
                Integer title = simple5.getTitle();
                description = simple5.getDescription();
                num = title;
            } else {
                num = null;
                localImage = null;
            }
            if (j3 != 0) {
                j2 |= zIsChecked ? 8L : 4L;
            }
            Drawable drawableM14707b = AppCompatResources.m14707b(this.f32763u.getContext(), zIsChecked ? R.drawable.ic_privacy_option_checked : R.drawable.ic_privacy_option);
            iM393n2 = ViewDataBinding.m393n(num);
            iM393n = ViewDataBinding.m393n(description);
            drawable = drawableM14707b;
        } else {
            localImage = null;
            iM393n = 0;
        }
        if ((j2 & 3) != 0) {
            SkuDao.a.m14096k0(this.f32762t, iM393n2);
            this.f32763u.setBackground(drawable);
            ImageView imageView = this.f32764v;
            Intrinsics2.m13089e(imageView, "$this$setGlideSrc");
            Glide.m1627e(imageView.getContext()).mo1655o(localImage).m1642N(imageView);
            SkuDao.a.m14096k0(this.f32787A, iM393n);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32788B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32788B = 2L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (8 != i) {
            return false;
        }
        this.f32766x = (Simple5) obj;
        synchronized (this) {
            this.f32788B |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
