// Code generated by dagger-compiler.  Do not edit.
package com.tally.yellowbrickme;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class BootstrapModule$$ModuleAdapter extends ModuleAdapter<BootstrapModule> {
  private static final String[] INJECTS = { "members/com.tally.yellowbrickme.BootstrapApplication", "members/com.tally.yellowbrickme.authenticator.BootstrapAuthenticatorActivity", "members/com.tally.yellowbrickme.ui.MainActivity", "members/com.tally.yellowbrickme.ui.BootstrapTimerActivity", "members/com.tally.yellowbrickme.ui.CheckInsListFragment", "members/com.tally.yellowbrickme.ui.NavigationDrawerFragment", "members/com.tally.yellowbrickme.ui.NewsActivity", "members/com.tally.yellowbrickme.ui.NewsListFragment", "members/com.tally.yellowbrickme.ui.UserActivity", "members/com.tally.yellowbrickme.ui.UserListFragment", "members/com.tally.yellowbrickme.core.TimerService", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public BootstrapModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, false /*library*/);
  }

  @Override
  protected BootstrapModule newModule() {
    return new com.tally.yellowbrickme.BootstrapModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("com.squareup.otto.Bus", new ProvideOttoBusProvidesAdapter(module));
    map.put("com.tally.yellowbrickme.authenticator.LogoutService", new ProvideLogoutServiceProvidesAdapter(module));
    map.put("com.tally.yellowbrickme.core.BootstrapService", new ProvideBootstrapServiceProvidesAdapter(module));
    map.put("com.tally.yellowbrickme.BootstrapServiceProvider", new ProvideBootstrapServiceProviderProvidesAdapter(module));
    map.put("com.tally.yellowbrickme.authenticator.ApiKeyProvider", new ProvideApiKeyProviderProvidesAdapter(module));
    map.put("com.google.gson.Gson", new ProvideGsonProvidesAdapter(module));
    map.put("com.tally.yellowbrickme.core.RestErrorHandler", new ProvideRestErrorHandlerProvidesAdapter(module));
    map.put("com.tally.yellowbrickme.core.RestAdapterRequestInterceptor", new ProvideRestAdapterRequestInterceptorProvidesAdapter(module));
    map.put("retrofit.RestAdapter", new ProvideRestAdapterProvidesAdapter(module));
  }

  /**
   * A {@code Binder<com.squareup.otto.Bus>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.squareup.otto.Bus>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideOttoBusProvidesAdapter extends Binding<com.squareup.otto.Bus>
      implements Provider<com.squareup.otto.Bus> {
    private final BootstrapModule module;

    public ProvideOttoBusProvidesAdapter(BootstrapModule module) {
      super("com.squareup.otto.Bus", null, IS_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideOttoBus()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.squareup.otto.Bus>}.
     */
    @Override
    public com.squareup.otto.Bus get() {
      return module.provideOttoBus();
    }
  }

  /**
   * A {@code Binder<com.tally.yellowbrickme.authenticator.LogoutService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.tally.yellowbrickme.authenticator.LogoutService} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.tally.yellowbrickme.authenticator.LogoutService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLogoutServiceProvidesAdapter extends Binding<com.tally.yellowbrickme.authenticator.LogoutService>
      implements Provider<com.tally.yellowbrickme.authenticator.LogoutService> {
    private final BootstrapModule module;
    private Binding<android.content.Context> context;
    private Binding<android.accounts.AccountManager> accountManager;

    public ProvideLogoutServiceProvidesAdapter(BootstrapModule module) {
      super("com.tally.yellowbrickme.authenticator.LogoutService", null, IS_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideLogoutService()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", BootstrapModule.class);
      accountManager = (Binding<android.accounts.AccountManager>) linker.requestBinding("android.accounts.AccountManager", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
      getBindings.add(accountManager);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.tally.yellowbrickme.authenticator.LogoutService>}.
     */
    @Override
    public com.tally.yellowbrickme.authenticator.LogoutService get() {
      return module.provideLogoutService(context.get(), accountManager.get());
    }
  }

  /**
   * A {@code Binder<com.tally.yellowbrickme.core.BootstrapService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.tally.yellowbrickme.core.BootstrapService} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.tally.yellowbrickme.core.BootstrapService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideBootstrapServiceProvidesAdapter extends Binding<com.tally.yellowbrickme.core.BootstrapService>
      implements Provider<com.tally.yellowbrickme.core.BootstrapService> {
    private final BootstrapModule module;
    private Binding<retrofit.RestAdapter> restAdapter;

    public ProvideBootstrapServiceProvidesAdapter(BootstrapModule module) {
      super("com.tally.yellowbrickme.core.BootstrapService", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideBootstrapService()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      restAdapter = (Binding<retrofit.RestAdapter>) linker.requestBinding("retrofit.RestAdapter", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(restAdapter);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.tally.yellowbrickme.core.BootstrapService>}.
     */
    @Override
    public com.tally.yellowbrickme.core.BootstrapService get() {
      return module.provideBootstrapService(restAdapter.get());
    }
  }

  /**
   * A {@code Binder<com.tally.yellowbrickme.BootstrapServiceProvider>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.tally.yellowbrickme.BootstrapServiceProvider} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.tally.yellowbrickme.BootstrapServiceProvider>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideBootstrapServiceProviderProvidesAdapter extends Binding<BootstrapServiceProvider>
      implements Provider<BootstrapServiceProvider> {
    private final BootstrapModule module;
    private Binding<retrofit.RestAdapter> restAdapter;
    private Binding<com.tally.yellowbrickme.authenticator.ApiKeyProvider> apiKeyProvider;

    public ProvideBootstrapServiceProviderProvidesAdapter(BootstrapModule module) {
      super("com.tally.yellowbrickme.BootstrapServiceProvider", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideBootstrapServiceProvider()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      restAdapter = (Binding<retrofit.RestAdapter>) linker.requestBinding("retrofit.RestAdapter", BootstrapModule.class);
      apiKeyProvider = (Binding<com.tally.yellowbrickme.authenticator.ApiKeyProvider>) linker.requestBinding("com.tally.yellowbrickme.authenticator.ApiKeyProvider", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(restAdapter);
      getBindings.add(apiKeyProvider);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.tally.yellowbrickme.BootstrapServiceProvider>}.
     */
    @Override
    public BootstrapServiceProvider get() {
      return module.provideBootstrapServiceProvider(restAdapter.get(), apiKeyProvider.get());
    }
  }

  /**
   * A {@code Binder<com.tally.yellowbrickme.authenticator.ApiKeyProvider>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.tally.yellowbrickme.authenticator.ApiKeyProvider} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.tally.yellowbrickme.authenticator.ApiKeyProvider>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideApiKeyProviderProvidesAdapter extends Binding<com.tally.yellowbrickme.authenticator.ApiKeyProvider>
      implements Provider<com.tally.yellowbrickme.authenticator.ApiKeyProvider> {
    private final BootstrapModule module;
    private Binding<android.accounts.AccountManager> accountManager;

    public ProvideApiKeyProviderProvidesAdapter(BootstrapModule module) {
      super("com.tally.yellowbrickme.authenticator.ApiKeyProvider", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideApiKeyProvider()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      accountManager = (Binding<android.accounts.AccountManager>) linker.requestBinding("android.accounts.AccountManager", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(accountManager);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.tally.yellowbrickme.authenticator.ApiKeyProvider>}.
     */
    @Override
    public com.tally.yellowbrickme.authenticator.ApiKeyProvider get() {
      return module.provideApiKeyProvider(accountManager.get());
    }
  }

  /**
   * A {@code Binder<com.google.gson.Gson>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.google.gson.Gson>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideGsonProvidesAdapter extends Binding<com.google.gson.Gson>
      implements Provider<com.google.gson.Gson> {
    private final BootstrapModule module;

    public ProvideGsonProvidesAdapter(BootstrapModule module) {
      super("com.google.gson.Gson", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideGson()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.google.gson.Gson>}.
     */
    @Override
    public com.google.gson.Gson get() {
      return module.provideGson();
    }
  }

  /**
   * A {@code Binder<com.tally.yellowbrickme.core.RestErrorHandler>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.tally.yellowbrickme.core.RestErrorHandler} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.tally.yellowbrickme.core.RestErrorHandler>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideRestErrorHandlerProvidesAdapter extends Binding<com.tally.yellowbrickme.core.RestErrorHandler>
      implements Provider<com.tally.yellowbrickme.core.RestErrorHandler> {
    private final BootstrapModule module;
    private Binding<com.squareup.otto.Bus> bus;

    public ProvideRestErrorHandlerProvidesAdapter(BootstrapModule module) {
      super("com.tally.yellowbrickme.core.RestErrorHandler", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideRestErrorHandler()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      bus = (Binding<com.squareup.otto.Bus>) linker.requestBinding("com.squareup.otto.Bus", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(bus);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.tally.yellowbrickme.core.RestErrorHandler>}.
     */
    @Override
    public com.tally.yellowbrickme.core.RestErrorHandler get() {
      return module.provideRestErrorHandler(bus.get());
    }
  }

  /**
   * A {@code Binder<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.tally.yellowbrickme.core.RestAdapterRequestInterceptor} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideRestAdapterRequestInterceptorProvidesAdapter extends Binding<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor>
      implements Provider<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor> {
    private final BootstrapModule module;
    private Binding<com.tally.yellowbrickme.core.UserAgentProvider> userAgentProvider;

    public ProvideRestAdapterRequestInterceptorProvidesAdapter(BootstrapModule module) {
      super("com.tally.yellowbrickme.core.RestAdapterRequestInterceptor", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideRestAdapterRequestInterceptor()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      userAgentProvider = (Binding<com.tally.yellowbrickme.core.UserAgentProvider>) linker.requestBinding("com.tally.yellowbrickme.core.UserAgentProvider", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(userAgentProvider);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor>}.
     */
    @Override
    public com.tally.yellowbrickme.core.RestAdapterRequestInterceptor get() {
      return module.provideRestAdapterRequestInterceptor(userAgentProvider.get());
    }
  }

  /**
   * A {@code Binder<retrofit.RestAdapter>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code retrofit.RestAdapter} and its
   * dependencies.
   * 
   * Being a {@code Provider<retrofit.RestAdapter>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideRestAdapterProvidesAdapter extends Binding<retrofit.RestAdapter>
      implements Provider<retrofit.RestAdapter> {
    private final BootstrapModule module;
    private Binding<com.tally.yellowbrickme.core.RestErrorHandler> restErrorHandler;
    private Binding<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor> restRequestInterceptor;
    private Binding<com.google.gson.Gson> gson;

    public ProvideRestAdapterProvidesAdapter(BootstrapModule module) {
      super("retrofit.RestAdapter", null, NOT_SINGLETON, "com.tally.yellowbrickme.BootstrapModule.provideRestAdapter()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      restErrorHandler = (Binding<com.tally.yellowbrickme.core.RestErrorHandler>) linker.requestBinding("com.tally.yellowbrickme.core.RestErrorHandler", BootstrapModule.class);
      restRequestInterceptor = (Binding<com.tally.yellowbrickme.core.RestAdapterRequestInterceptor>) linker.requestBinding("com.tally.yellowbrickme.core.RestAdapterRequestInterceptor", BootstrapModule.class);
      gson = (Binding<com.google.gson.Gson>) linker.requestBinding("com.google.gson.Gson", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(restErrorHandler);
      getBindings.add(restRequestInterceptor);
      getBindings.add(gson);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<retrofit.RestAdapter>}.
     */
    @Override
    public retrofit.RestAdapter get() {
      return module.provideRestAdapter(restErrorHandler.get(), restRequestInterceptor.get(), gson.get());
    }
  }
}
