package p007c.p451o.p452a.p461e.p464c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p187m.p188a.p189a.PhotoView;
import p007c.p451o.p452a.C5729a;
import p007c.p451o.p452a.p453c.p455b.p458c.SwipeToDismissHandler;
import p007c.p451o.p452a.p460d.ImageLoader;
import p007c.p451o.p452a.p461e.p462a.ImagesPagerAdapter;
import p007c.p451o.p452a.p461e.p463b.BuilderData;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView2;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView3;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView5;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView6;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView7;
import p007c.p451o.p452a.p461e.p465d.TransitionImageAnimator;
import p007c.p451o.p452a.p461e.p465d.View2;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p644b.p645c.AlertDialog;

/* JADX INFO: renamed from: c.o.a.e.c.a, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerDialog<T> {

    /* JADX INFO: renamed from: a */
    public final AlertDialog f27878a;

    /* JADX INFO: renamed from: b */
    public final ImageViewerView<T> f27879b;

    /* JADX INFO: renamed from: c */
    public boolean f27880c;

    /* JADX INFO: renamed from: d */
    public final BuilderData<T> f27881d;

    /* JADX INFO: renamed from: c.o.a.e.c.a$a */
    /* JADX INFO: compiled from: ImageViewerDialog.kt */
    public static final class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            Drawable drawable;
            ImageViewerDialog imageViewerDialog = ImageViewerDialog.this;
            ImageViewerView<T> imageViewerView = imageViewerDialog.f27879b;
            ImageView imageView = imageViewerDialog.f27881d.f27875g;
            boolean z = imageViewerDialog.f27880c;
            C5729a.m12430C(imageViewerView.f27903p);
            C5729a.m12429B(imageViewerView.f27906s);
            imageViewerView.f27905r = imageView;
            ImageLoader<T> imageLoader = imageViewerView.f27891D;
            if (imageLoader != null) {
                imageLoader.mo12489a(imageViewerView.f27904q, imageViewerView.f27890C.get(imageViewerView.f27893F));
            }
            ImageView imageView2 = imageViewerView.f27904q;
            Intrinsics2.m13090f(imageView2, "$this$copyBitmapFrom");
            if (imageView != null && (drawable = imageView.getDrawable()) != null && (drawable instanceof BitmapDrawable)) {
                imageView2.setImageBitmap(((BitmapDrawable) drawable).getBitmap());
            }
            imageViewerView.f27892E = new TransitionImageAnimator(imageView, imageViewerView.f27904q, imageViewerView.f27903p);
            SwipeToDismissHandler swipeToDismissHandler = new SwipeToDismissHandler(imageViewerView.f27902o, new ImageViewerView6(imageViewerView), new ImageViewerView7(imageViewerView), new ImageViewerView5(imageViewerView));
            imageViewerView.f27911x = swipeToDismissHandler;
            imageViewerView.f27900m.setOnTouchListener(swipeToDismissHandler);
            if (!z) {
                imageViewerView.f27901n.setAlpha(1.0f);
                C5729a.m12429B(imageViewerView.f27903p);
                C5729a.m12430C(imageViewerView.f27906s);
                return;
            }
            TransitionImageAnimator transitionImageAnimator = imageViewerView.f27892E;
            if (transitionImageAnimator == null) {
                Intrinsics2.m13096l("transitionImageAnimator");
                throw null;
            }
            int[] iArr = imageViewerView.f27898k;
            ImageViewerView2 imageViewerView2 = new ImageViewerView2(imageViewerView);
            ImageViewerView3 imageViewerView3 = new ImageViewerView3(imageViewerView);
            Intrinsics2.m13090f(iArr, "containerPadding");
            Intrinsics2.m13090f(imageViewerView2, "onTransitionStart");
            Intrinsics2.m13090f(imageViewerView3, "onTransitionEnd");
            if (!C5729a.m12471z(transitionImageAnimator.f27924c)) {
                imageViewerView3.mo2c();
                return;
            }
            imageViewerView2.mo3b(200L);
            transitionImageAnimator.f27922a = true;
            transitionImageAnimator.m12502c();
            ViewGroup viewGroupM12501b = transitionImageAnimator.m12501b();
            viewGroupM12501b.post(new View2(viewGroupM12501b, transitionImageAnimator, imageViewerView3, iArr));
        }
    }

    /* JADX INFO: renamed from: c.o.a.e.c.a$b */
    /* JADX INFO: compiled from: ImageViewerDialog.kt */
    public static final class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            Objects.requireNonNull(ImageViewerDialog.this.f27881d);
        }
    }

    /* JADX INFO: renamed from: c.o.a.e.c.a$c */
    /* JADX INFO: compiled from: ImageViewerDialog.kt */
    public static final class c implements DialogInterface.OnKeyListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            T next;
            ImageViewerDialog imageViewerDialog = ImageViewerDialog.this;
            Intrinsics2.m13086b(keyEvent, "event");
            Objects.requireNonNull(imageViewerDialog);
            if (i != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                return false;
            }
            if (imageViewerDialog.f27879b.m12495f()) {
                ImageViewerView<T> imageViewerView = imageViewerDialog.f27879b;
                ImagesPagerAdapter<T> imagesPagerAdapter = imageViewerView.f27907t;
                if (imagesPagerAdapter != null) {
                    int currentPosition$imageviewer_release = imageViewerView.getCurrentPosition$imageviewer_release();
                    Iterator<T> it = imagesPagerAdapter.f27862f.iterator();
                    do {
                        next = (T) null;
                        if (!it.hasNext()) {
                            break;
                        }
                        next = it.next();
                    } while (!(((ImagesPagerAdapter.a) next).f27858b == currentPosition$imageviewer_release));
                    ImagesPagerAdapter.a aVar = next;
                    if (aVar != null) {
                        PhotoView photoView = aVar.f27866e;
                        Intrinsics2.m13090f(photoView, "$this$resetScale");
                        photoView.f5441h.m2728q(photoView.getMinimumScale(), true);
                    }
                }
            } else {
                imageViewerDialog.f27879b.m12493d();
            }
            return true;
        }
    }

    public ImageViewerDialog(Context context, BuilderData<T> builderData) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(builderData, "builderData");
        this.f27881d = builderData;
        ImageViewerView<T> imageViewerView = new ImageViewerView<>(context, null, 0, 6, null);
        this.f27879b = imageViewerView;
        this.f27880c = true;
        imageViewerView.setZoomingAllowed$imageviewer_release(builderData.f27873e);
        imageViewerView.setSwipeToDismissAllowed$imageviewer_release(builderData.f27874f);
        imageViewerView.setContainerPadding$imageviewer_release(builderData.f27871c);
        Objects.requireNonNull(builderData);
        imageViewerView.setImagesMargin$imageviewer_release(0);
        Objects.requireNonNull(builderData);
        imageViewerView.setOverlayView$imageviewer_release(null);
        imageViewerView.setBackgroundColor(builderData.f27869a);
        imageViewerView.m12496g(builderData.f27876h, builderData.f27870b, builderData.f27877i);
        imageViewerView.setOnPageChange$imageviewer_release(new ImageViewerDialog2(this));
        imageViewerView.setOnDismiss$imageviewer_release(new ImageViewerDialog3(this));
        AlertDialog alertDialogCreate = new AlertDialog.a(context, builderData.f27872d ? R.style.ImageViewerDialog_NoStatusBar : R.style.ImageViewerDialog_Default).setView(imageViewerView).mo11260d(new c()).create();
        alertDialogCreate.setOnShowListener(new a());
        alertDialogCreate.setOnDismissListener(new b());
        Intrinsics2.m13086b(alertDialogCreate, "AlertDialog\n            …Dismiss() }\n            }");
        this.f27878a = alertDialogCreate;
    }
}
