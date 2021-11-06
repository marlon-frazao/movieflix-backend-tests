import React from 'react';
import './styles.scss';

const Navbar = () => (
    <nav className="row bg-primary main-nav">
        <div className="col-2">
            <a href="link" className="nav-logo-text">
                <h4>MovieFlix</h4>
            </a>
        </div>
        <div>
            <button className="btn btn-sair">
                <p className="btn-text">SAIR</p>
            </button>
        </div>
    </nav>
)

export default Navbar;