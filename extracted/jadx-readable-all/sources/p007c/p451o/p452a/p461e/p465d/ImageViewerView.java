package p007c.p451o.p452a.p461e.p465d;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import p000.C7397r0;
import p007c.p451o.p452a.C5729a;
import p007c.p451o.p452a.p453c.p455b.p456a.SimpleOnGestureListener;
import p007c.p451o.p452a.p453c.p455b.p457b.SwipeDirection;
import p007c.p451o.p452a.p453c.p455b.p457b.SwipeDirectionDetector;
import p007c.p451o.p452a.p453c.p455b.p458c.SwipeToDismissHandler;
import p007c.p451o.p452a.p460d.ImageLoader;
import p007c.p451o.p452a.p461e.p462a.ImagesPagerAdapter;
import p477d1.Unit;
import p477d1.p483s.Collections4;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p636z0.p685e0.TransitionManager;
import p636z0.p725k.p739l.GestureDetectorCompat;

/* JADX INFO: renamed from: c.o.a.e.d.a, reason: use source file name */
/* JADX INFO: compiled from: ImageViewerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageViewerView<T> extends RelativeLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f27887f = 0;

    /* JADX INFO: renamed from: A */
    public boolean f27888A;

    /* JADX INFO: renamed from: B */
    public SwipeDirection f27889B;

    /* JADX INFO: renamed from: C */
    public List<? extends T> f27890C;

    /* JADX INFO: renamed from: D */
    public ImageLoader<T> f27891D;

    /* JADX INFO: renamed from: E */
    public TransitionImageAnimator f27892E;

    /* JADX INFO: renamed from: F */
    public int f27893F;

    /* JADX INFO: renamed from: g */
    public boolean f27894g;

    /* JADX INFO: renamed from: h */
    public boolean f27895h;

    /* JADX INFO: renamed from: i */
    public InterfaceC6153a<Unit> f27896i;

    /* JADX INFO: renamed from: j */
    public InterfaceC6164l<? super Integer, Unit> f27897j;

    /* JADX INFO: renamed from: k */
    public int[] f27898k;

    /* JADX INFO: renamed from: l */
    public View f27899l;

    /* JADX INFO: renamed from: m */
    public ViewGroup f27900m;

    /* JADX INFO: renamed from: n */
    public View f27901n;

    /* JADX INFO: renamed from: o */
    public ViewGroup f27902o;

    /* JADX INFO: renamed from: p */
    public final FrameLayout f27903p;

    /* JADX INFO: renamed from: q */
    public final ImageView f27904q;

    /* JADX INFO: renamed from: r */
    public ImageView f27905r;

    /* JADX INFO: renamed from: s */
    public MultiTouchViewPager f27906s;

    /* JADX INFO: renamed from: t */
    public ImagesPagerAdapter<T> f27907t;

    /* JADX INFO: renamed from: u */
    public SwipeDirectionDetector f27908u;

    /* JADX INFO: renamed from: v */
    public GestureDetectorCompat f27909v;

    /* JADX INFO: renamed from: w */
    public ScaleGestureDetector f27910w;

    /* JADX INFO: renamed from: x */
    public SwipeToDismissHandler f27911x;

    /* JADX INFO: renamed from: y */
    public boolean f27912y;

    /* JADX INFO: renamed from: z */
    public boolean f27913z;

    /* JADX INFO: renamed from: c.o.a.e.d.a$a */
    /* JADX INFO: compiled from: ImageViewerView.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Integer, Unit> {
        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Integer num) {
            int iIntValue = num.intValue();
            ImageViewerView imageViewerView = ImageViewerView.this;
            ImageView imageView = imageViewerView.f27905r;
            if (imageView != null) {
                if (imageViewerView.getCurrentPosition$imageviewer_release() == imageViewerView.f27893F) {
                    Intrinsics2.m13090f(imageView, "$this$makeInvisible");
                    imageView.setVisibility(4);
                } else {
                    Intrinsics2.m13090f(imageView, "$this$makeVisible");
                    imageView.setVisibility(0);
                }
            }
            InterfaceC6164l<Integer, Unit> onPageChange$imageviewer_release = ImageViewerView.this.getOnPageChange$imageviewer_release();
            if (onPageChange$imageviewer_release != null) {
                onPageChange$imageviewer_release.mo3b(Integer.valueOf(iIntValue));
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: c.o.a.e.d.a$b */
    /* JADX INFO: compiled from: ImageViewerView.kt */
    public static final class b extends Lambda implements InterfaceC6164l<Long, Unit> {
        public b() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Long l) {
            long jLongValue = l.longValue();
            View view = ImageViewerView.this.f27901n;
            C5729a.m12450e(view, Float.valueOf(view.getAlpha()), Float.valueOf(0.0f), jLongValue);
            View overlayView$imageviewer_release = ImageViewerView.this.getOverlayView$imageviewer_release();
            if (overlayView$imageviewer_release != null) {
                View overlayView$imageviewer_release2 = ImageViewerView.this.getOverlayView$imageviewer_release();
                C5729a.m12450e(overlayView$imageviewer_release, overlayView$imageviewer_release2 != null ? Float.valueOf(overlayView$imageviewer_release2.getAlpha()) : null, Float.valueOf(0.0f), jLongValue);
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: c.o.a.e.d.a$c */
    /* JADX INFO: compiled from: ImageViewerView.kt */
    public static final class c extends Lambda implements InterfaceC6153a<Unit> {
        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            InterfaceC6153a<Unit> onDismiss$imageviewer_release = ImageViewerView.this.getOnDismiss$imageviewer_release();
            if (onDismiss$imageviewer_release != null) {
                onDismiss$imageviewer_release.mo2c();
            }
            return Unit.f29502a;
        }
    }

    public ImageViewerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ImageViewerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ImageViewerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12491b(ImageViewerView imageViewerView, MotionEvent motionEvent, boolean z) {
        View view = imageViewerView.f27899l;
        if (view == null || z) {
            return;
        }
        Intrinsics2.m13090f(view, "$this$switchVisibilityWithAnimation");
        boolean z2 = view.getVisibility() == 0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", z2 ? 1.0f : 0.0f, z2 ? 0.0f : 1.0f);
        objectAnimatorOfFloat.setDuration(ViewConfiguration.getDoubleTapTimeout());
        if (z2) {
            objectAnimatorOfFloat.addListener(new p007c.p451o.p452a.p453c.p454a.View(view, z2));
        } else {
            Intrinsics2.m13090f(view, "$this$makeVisible");
            view.setVisibility(0);
        }
        objectAnimatorOfFloat.start();
        super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDismissToBottom() {
        ImageView imageView = this.f27905r;
        if (imageView == null || !C5729a.m12471z(imageView)) {
            return true;
        }
        return !(getCurrentPosition$imageviewer_release() == this.f27893F);
    }

    private final void setStartPosition(int i) {
        this.f27893F = i;
        setCurrentPosition$imageviewer_release(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m12492c() {
        C5729a.m12430C(this.f27903p);
        C5729a.m12429B(this.f27906s);
        C5729a.m12451f(this.f27902o, 0, 0, 0, 0);
        TransitionImageAnimator transitionImageAnimator = this.f27892E;
        if (transitionImageAnimator == null) {
            Intrinsics2.m13096l("transitionImageAnimator");
            throw null;
        }
        boolean shouldDismissToBottom = getShouldDismissToBottom();
        b bVar = new b();
        c cVar = new c();
        Intrinsics2.m13090f(bVar, "onTransitionStart");
        Intrinsics2.m13090f(cVar, "onTransitionEnd");
        if (!C5729a.m12471z(transitionImageAnimator.f27924c) || shouldDismissToBottom) {
            ImageView imageView = transitionImageAnimator.f27924c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            cVar.mo2c();
            return;
        }
        bVar.mo3b(250L);
        transitionImageAnimator.f27922a = true;
        transitionImageAnimator.f27923b = true;
        TransitionManager.m15519a(transitionImageAnimator.m12501b(), transitionImageAnimator.m12500a(new TransitionImageAnimator2(transitionImageAnimator, cVar)));
        transitionImageAnimator.m12502c();
        transitionImageAnimator.f27926e.requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m12493d() {
        if (!getShouldDismissToBottom()) {
            m12492c();
            return;
        }
        SwipeToDismissHandler swipeToDismissHandler = this.f27911x;
        if (swipeToDismissHandler != null) {
            swipeToDismissHandler.m12478a(swipeToDismissHandler.f27845i.getHeight());
        } else {
            Intrinsics2.m13096l("swipeDismissHandler");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:92:0x0184  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TransitionImageAnimator transitionImageAnimator;
        SwipeDirection swipeDirection;
        View view;
        Intrinsics2.m13090f(motionEvent, "event");
        View view2 = this.f27899l;
        boolean zOnTouch = true;
        if (((view2 != null && view2.getVisibility() == 0) && (view = this.f27899l) != null && view.dispatchTouchEvent(motionEvent)) || (transitionImageAnimator = this.f27892E) == null || transitionImageAnimator.f27922a) {
            return true;
        }
        if (this.f27913z && motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            this.f27913z = false;
            SwipeToDismissHandler swipeToDismissHandler = this.f27911x;
            if (swipeToDismissHandler == null) {
                Intrinsics2.m13096l("swipeDismissHandler");
                throw null;
            }
            swipeToDismissHandler.onTouch(this.f27900m, motionEvent);
            this.f27906s.dispatchTouchEvent(motionEvent);
            this.f27888A = m12494e(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f27889B = null;
            this.f27912y = false;
            this.f27906s.dispatchTouchEvent(motionEvent);
            SwipeToDismissHandler swipeToDismissHandler2 = this.f27911x;
            if (swipeToDismissHandler2 == null) {
                Intrinsics2.m13096l("swipeDismissHandler");
                throw null;
            }
            swipeToDismissHandler2.onTouch(this.f27900m, motionEvent);
            this.f27888A = m12494e(motionEvent);
        }
        this.f27910w.onTouchEvent(motionEvent);
        ((GestureDetectorCompat.b) this.f27909v.f38056a).f38057a.onTouchEvent(motionEvent);
        if (this.f27889B == null && (this.f27910w.isInProgress() || motionEvent.getPointerCount() > 1 || this.f27912y)) {
            this.f27912y = true;
            return this.f27906s.dispatchTouchEvent(motionEvent);
        }
        if (m12495f()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        SwipeDirectionDetector swipeDirectionDetector = this.f27908u;
        Objects.requireNonNull(swipeDirectionDetector);
        Intrinsics2.m13090f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            swipeDirectionDetector.f27838b = motionEvent.getX();
            swipeDirectionDetector.f27839c = motionEvent.getY();
        } else if (action == 1) {
            if (!swipeDirectionDetector.f27840d) {
                swipeDirectionDetector.f27841e.mo3b(SwipeDirection.NOT_DETECTED);
            }
            swipeDirectionDetector.f27839c = 0.0f;
            swipeDirectionDetector.f27838b = 0.0f;
            swipeDirectionDetector.f27840d = false;
        } else if (action != 2) {
            if (action == 3) {
                if (!swipeDirectionDetector.f27840d) {
                    swipeDirectionDetector.f27841e.mo3b(SwipeDirection.NOT_DETECTED);
                }
                swipeDirectionDetector.f27839c = 0.0f;
                swipeDirectionDetector.f27838b = 0.0f;
                swipeDirectionDetector.f27840d = false;
            }
        } else if (!swipeDirectionDetector.f27840d) {
            float x = motionEvent.getX(0) - swipeDirectionDetector.f27838b;
            float y = motionEvent.getY(0) - swipeDirectionDetector.f27839c;
            if (((float) Math.sqrt((y * y) + (x * x))) > swipeDirectionDetector.f27837a) {
                swipeDirectionDetector.f27840d = true;
                InterfaceC6164l<SwipeDirection, Unit> interfaceC6164l = swipeDirectionDetector.f27841e;
                double d = 180;
                double dAtan2 = ((((Math.atan2(swipeDirectionDetector.f27839c - motionEvent.getY(), motionEvent.getX() - swipeDirectionDetector.f27838b) + 3.141592653589793d) * d) / 3.141592653589793d) + d) % ((double) 360);
                Objects.requireNonNull(SwipeDirection.f27836l);
                if (dAtan2 >= 0.0d && dAtan2 <= 45.0d) {
                    swipeDirection = SwipeDirection.RIGHT;
                } else if (dAtan2 >= 45.0d && dAtan2 <= 135.0d) {
                    swipeDirection = SwipeDirection.UP;
                } else if (dAtan2 >= 135.0d && dAtan2 <= 225.0d) {
                    swipeDirection = SwipeDirection.LEFT;
                } else if (dAtan2 < 225.0d || dAtan2 > 315.0d) {
                    swipeDirection = (dAtan2 < 315.0d || dAtan2 > 360.0d) ? SwipeDirection.NOT_DETECTED : SwipeDirection.RIGHT;
                } else {
                    swipeDirection = SwipeDirection.DOWN;
                }
                interfaceC6164l.mo3b(swipeDirection);
            }
        }
        SwipeDirection swipeDirection2 = this.f27889B;
        if (swipeDirection2 != null) {
            int iOrdinal = swipeDirection2.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                if (this.f27895h && !this.f27912y && this.f27906s.f29329i0) {
                    SwipeToDismissHandler swipeToDismissHandler3 = this.f27911x;
                    if (swipeToDismissHandler3 == null) {
                        Intrinsics2.m13096l("swipeDismissHandler");
                        throw null;
                    }
                    zOnTouch = swipeToDismissHandler3.onTouch(this.f27900m, motionEvent);
                }
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                zOnTouch = this.f27906s.dispatchTouchEvent(motionEvent);
            }
        }
        return zOnTouch;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12494e(MotionEvent motionEvent) {
        View view = this.f27899l;
        if (view != null) {
            if ((view.getVisibility() == 0) && view.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12495f() {
        T next;
        ImagesPagerAdapter<T> imagesPagerAdapter = this.f27907t;
        if (imagesPagerAdapter == null) {
            return false;
        }
        int currentPosition$imageviewer_release = getCurrentPosition$imageviewer_release();
        Iterator<T> it = imagesPagerAdapter.f27862f.iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (!(((ImagesPagerAdapter.a) next).f27858b == currentPosition$imageviewer_release));
        ImagesPagerAdapter.a aVar = next;
        return aVar != null && aVar.f27866e.getScale() > 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m12496g(List<? extends T> list, int i, ImageLoader<T> imageLoader) {
        Intrinsics2.m13090f(list, "images");
        Intrinsics2.m13090f(imageLoader, "imageLoader");
        this.f27890C = list;
        this.f27891D = imageLoader;
        Context context = getContext();
        Intrinsics2.m13086b(context, "context");
        ImagesPagerAdapter<T> imagesPagerAdapter = new ImagesPagerAdapter<>(context, list, imageLoader, this.f27894g);
        this.f27907t = imagesPagerAdapter;
        this.f27906s.setAdapter(imagesPagerAdapter);
        setStartPosition(i);
    }

    public final int[] getContainerPadding$imageviewer_release() {
        return this.f27898k;
    }

    public final int getCurrentPosition$imageviewer_release() {
        return this.f27906s.getCurrentItem();
    }

    public final int getImagesMargin$imageviewer_release() {
        return this.f27906s.getPageMargin();
    }

    public final InterfaceC6153a<Unit> getOnDismiss$imageviewer_release() {
        return this.f27896i;
    }

    public final InterfaceC6164l<Integer, Unit> getOnPageChange$imageviewer_release() {
        return this.f27897j;
    }

    public final View getOverlayView$imageviewer_release() {
        return this.f27899l;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        findViewById(R.id.backgroundView).setBackgroundColor(i);
    }

    public final void setContainerPadding$imageviewer_release(int[] iArr) {
        Intrinsics2.m13090f(iArr, "<set-?>");
        this.f27898k = iArr;
    }

    public final void setCurrentPosition$imageviewer_release(int i) {
        this.f27906s.setCurrentItem(i);
    }

    public final void setImagesMargin$imageviewer_release(int i) {
        this.f27906s.setPageMargin(i);
    }

    public final void setOnDismiss$imageviewer_release(InterfaceC6153a<Unit> interfaceC6153a) {
        this.f27896i = interfaceC6153a;
    }

    public final void setOnPageChange$imageviewer_release(InterfaceC6164l<? super Integer, Unit> interfaceC6164l) {
        this.f27897j = interfaceC6164l;
    }

    public final void setOverlayView$imageviewer_release(View view) {
        this.f27899l = view;
        if (view != null) {
            this.f27900m.addView(view);
        }
    }

    public final void setSwipeToDismissAllowed$imageviewer_release(boolean z) {
        this.f27895h = z;
    }

    public final void setZoomingAllowed$imageviewer_release(boolean z) {
        this.f27894g = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13090f(context, "context");
        this.f27894g = true;
        this.f27895h = true;
        this.f27898k = new int[]{0, 0, 0, 0};
        this.f27890C = Collections4.f29519f;
        View.inflate(context, R.layout.view_image_viewer, this);
        View viewFindViewById = findViewById(R.id.rootContainer);
        Intrinsics2.m13086b(viewFindViewById, "findViewById(R.id.rootContainer)");
        this.f27900m = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.backgroundView);
        Intrinsics2.m13086b(viewFindViewById2, "findViewById(R.id.backgroundView)");
        this.f27901n = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.dismissContainer);
        Intrinsics2.m13086b(viewFindViewById3, "findViewById(R.id.dismissContainer)");
        this.f27902o = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.transitionImageContainer);
        Intrinsics2.m13086b(viewFindViewById4, "findViewById(R.id.transitionImageContainer)");
        this.f27903p = (FrameLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.transitionImageView);
        Intrinsics2.m13086b(viewFindViewById5, "findViewById(R.id.transitionImageView)");
        this.f27904q = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.imagesPager);
        Intrinsics2.m13086b(viewFindViewById6, "findViewById(R.id.imagesPager)");
        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) viewFindViewById6;
        this.f27906s = multiTouchViewPager;
        C5729a.m12449d(multiTouchViewPager, null, new a(), null, 5);
        Context context2 = getContext();
        Intrinsics2.m13086b(context2, "context");
        this.f27908u = new SwipeDirectionDetector(context2, new ImageViewerView4(this));
        this.f27909v = new GestureDetectorCompat(getContext(), new SimpleOnGestureListener(new C7397r0(0, this), new C7397r0(1, this)));
        this.f27910w = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener());
    }
}
